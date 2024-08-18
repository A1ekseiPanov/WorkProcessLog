package ru.panov.workprocessentity.entity.science;

import jakarta.persistence.*;
import lombok.*;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.Detail;
import ru.panov.workprocessentity.entity.user.User;

@Entity
@Table(schema = "sciences")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Science extends BaseEntity {
    @OneToOne
    @MapsId
    @JoinColumn(name = "science_detail_id")
    private ScienceDetail scienceDetail;
    @OneToOne
    @MapsId
    @JoinColumn(name = "mode_id")
    private Mode mode;
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}