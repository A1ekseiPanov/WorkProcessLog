package ru.panov.workprocessentity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import ru.panov.workprocessentity.entity.BaseEntity;

import java.time.LocalTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DetailInfo extends BaseEntity {
    //шифр детали
    private String cipher;
    //наименование детали
    private String name;
    // поверхность обработки детали
    private String face;
    //время на 1 деталь
    @Column(name = "time_one_detail")
    private LocalTime timeOneDetail;
    private Integer count;
    private String comment;
}