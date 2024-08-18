package ru.panov.workprocessentity.entity.work;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;
import ru.panov.workprocessentity.entity.Detail;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "another_details", schema = "work")
public class AnotherDetail extends Detail {
}