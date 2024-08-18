package ru.panov.workprocessentity.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class BaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
        @CreationTimestamp
        private LocalDateTime created;
        @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
        @UpdateTimestamp
        private LocalDateTime updated;
}