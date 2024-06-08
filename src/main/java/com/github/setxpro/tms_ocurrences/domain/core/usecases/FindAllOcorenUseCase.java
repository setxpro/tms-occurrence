package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;

import java.util.List;

public interface FindAllOcorenUseCase {
    List<Ocoren> execute();
}
