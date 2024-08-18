package ru.panov.workservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.panov.workprocessentity.entity.work.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work,Long> {
}