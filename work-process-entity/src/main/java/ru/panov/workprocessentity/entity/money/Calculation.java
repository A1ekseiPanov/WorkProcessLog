package ru.panov.workprocessentity.entity.money;

import jakarta.persistence.*;
import lombok.*;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.DetailInfo;

import java.math.BigDecimal;
//расчеты по деталям

@Entity
@Table(name = "сalculations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Calculation extends BaseEntity {
    @OneToOne
    @MapsId
    @JoinColumn(name = "detail_id")
    private DetailInfo detail;
    private BigDecimal price;
    private BigDecimal sum;
}