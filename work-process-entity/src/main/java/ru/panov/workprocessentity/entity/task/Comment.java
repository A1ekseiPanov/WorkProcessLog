package ru.panov.workprocessentity.entity.task;

import jakarta.persistence.*;
import lombok.*;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.user.User;

@Entity
@Table(name = "coments", schema = "task")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends BaseEntity {
    @Column(nullable = false)
    private String comment;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
}