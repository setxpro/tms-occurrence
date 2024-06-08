package com.github.setxpro.tms_ocurrences.domain.core.gateways;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;

import java.util.List;
import java.util.UUID;

public interface OcorenGateway {
    Ocoren create(List<OcorenDTO> ocorenDTO);
    List<Ocoren> findAll();
    Ocoren findOne(UUID id);
    Ocoren updateOne(UUID id, OcorenDTO ocorenDTO);
    void deleteOne(UUID id);
}
