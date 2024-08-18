package ru.panov.workprocessentity.entity.money;

import jakarta.persistence.*;
import lombok.*;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.Detail;

import java.math.BigDecimal;
//расчеты по деталям

@Entity
@Table(name = "сalculations",schema = "money")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Calculation extends BaseEntity {
    @OneToOne
    @MapsId
    @JoinColumn(name = "detail_id")
    private Detail detail;
    private BigDecimal price;
    private BigDecimal sum;
}