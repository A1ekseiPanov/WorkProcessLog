package ru.panov.workservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.panov.workprocessentity.entity.Detail;


@Repository
public interface DetailRepository extends JpaRepository<Detail,Long> {
}