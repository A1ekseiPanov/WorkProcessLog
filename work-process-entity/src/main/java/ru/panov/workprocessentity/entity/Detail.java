package ru.panov.workprocessentity.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Detail extends BaseEntity {
    //программа
    private String program;
    //шифр детали
    private String cipher;

    //наименование детали
    private String name;
    // поверхность обработки детали
    private String face;
    //время на 1 деталь
    @Column(name = "time_one_detail")
    private LocalTime timeOneDetail;
    //количество деталей
    private Integer count;
    private String comment;
    //оснастка
    @OneToOne(mappedBy = "detail")
    private ProductionAccessor productionAccessor;
}