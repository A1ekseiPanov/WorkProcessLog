package ru.panov.workprocessentity.entity.work;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.panov.workprocessentity.entity.DetailInfo;

@Entity
@Table(name = "engine_blades")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EngineBlade extends DetailInfo {
    //номер двигателя
    private String engine;
}