package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;

import java.util.List;

public interface CreateOcorenUseCase {
    Ocoren execute(List<OcorenDTO> ocorenDTO);
}
