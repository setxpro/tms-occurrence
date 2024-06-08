package com.github.setxpro.tms_ocurrences.infra.database.repositories;

import com.github.setxpro.tms_ocurrences.infra.database.models.OcorenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OcorenRepository extends JpaRepository<OcorenEntity, UUID> {
}
