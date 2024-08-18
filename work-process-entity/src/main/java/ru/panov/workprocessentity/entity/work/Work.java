package ru.panov.workprocessentity.entity.work;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.DetailInfo;
import ru.panov.workprocessentity.entity.user.User;

import java.time.LocalTime;

@Entity
@Table(name = "work")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Work extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "detail_info_id")
    private DetailInfo detailInfo;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}