package ru.panov.workprocessentity.entity;

import jakarta.persistence.*;
import ru.panov.workprocessentity.entity.BaseEntity;
import ru.panov.workprocessentity.entity.Detail;

//оснастка
@Entity
public class ProductionAccessor  extends BaseEntity {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "accessors_details",
            joinColumns =
                    { @JoinColumn(name = "accessor_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "detail_id", referencedColumnName = "id") })
    private Detail detail;
    private String name;
    private String cipher;
}