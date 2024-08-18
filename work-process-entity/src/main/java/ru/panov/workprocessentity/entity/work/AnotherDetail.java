package ru.panov.workprocessentity.entity.work;

import jakarta.persistence.Entity;
import lombok.*;
import ru.panov.workprocessentity.entity.DetailInfo;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class AnotherDetail extends DetailInfo {
}