package ru.panov.workprocessentity.entity.work;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.panov.workprocessentity.entity.Detail;

@Entity
@Table(name = "engine_blades", schema = "work")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class EngineBlade extends Detail {
    //номер двигателя
    private String engine;
}