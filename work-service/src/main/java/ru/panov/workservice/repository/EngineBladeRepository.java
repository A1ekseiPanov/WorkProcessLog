package ru.panov.workservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.panov.workprocessentity.entity.work.EngineBlade;

import java.util.Optional;

@Repository
public interface EngineBladeRepository extends JpaRepository<EngineBlade, Long> {
}