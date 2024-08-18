package ru.panov.workprocessentity.entity.science;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import ru.panov.workprocessentity.entity.BaseEntity;

//режимы наплавки
@Entity
@Table(name = "modes", schema = "science")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Mode extends BaseEntity {
    @Column(name = "surfacing_speed")
    // скорость наплавки
    private String surfacingSpeed;
    @Column(name = "powder_feed_rate")
    //скорость подачи порошка
    private String powderFeedRate;
    //Мощность наплавки
    private String power;
    @Column(name = "feed_rate_conveying_gas")
    //скорость подачи транспортирующего газа
    private String feedRateConveyingGas;
    @Column(name = "speed_protective_gas")
    //скорость подачи защитного газа
    private String speedProtectiveGas;
    //перекрытие между валиками
    private String overlap;
}