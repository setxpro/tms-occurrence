package com.github.setxpro.tms_ocurrences.infra.database.repositories;

import com.github.setxpro.tms_ocurrences.infra.database.models.Access;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessEntityRepository extends JpaRepository<Access, Long> {
    Optional<Access> findByUsername(String username);
}
