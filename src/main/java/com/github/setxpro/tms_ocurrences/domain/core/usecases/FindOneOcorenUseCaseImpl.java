package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;

import java.util.UUID;

public class FindOneOcorenUseCaseImpl implements FindOneOcorenUseCase {

    private final OcorenGateway ocorenGateway;

    public FindOneOcorenUseCaseImpl(OcorenGateway ocorenGateway) {
        this.ocorenGateway = ocorenGateway;
    }

    @Override
    public Ocoren execute(UUID id) {
        return ocorenGateway.findOne(id);
    }
}
