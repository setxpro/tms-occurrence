package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;

import java.util.UUID;

public interface FindOneOcorenUseCase {
    Ocoren execute(UUID id);
}
