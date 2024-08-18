package ru.panov.workprocessentity.entity.science;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.*;
import ru.panov.workprocessentity.entity.DetailInfo;
import ru.panov.workprocessentity.entity.user.User;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Science extends DetailInfo {
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