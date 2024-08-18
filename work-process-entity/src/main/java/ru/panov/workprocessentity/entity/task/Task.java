package ru.panov.workprocessentity.entity.task;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.user.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tasks", schema = "task")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Task extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String header;
    @Column(nullable = false)
    private String description;
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Enumerated(value = EnumType.STRING)
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "task")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @Fetch(FetchMode.SELECT)
    private List<Comment> comments = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "tasks_performers",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "performer_id"))
    private List<User> performers = new ArrayList<>();
}