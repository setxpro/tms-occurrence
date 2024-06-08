package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;

import java.util.UUID;

public interface UpdateOneOcorenUseCase {
    Ocoren execute(UUID id, OcorenDTO ocorenDTO);
}
