package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;

import java.util.UUID;

public class DeleteOneOcorenUseCaseImpl implements DeleteOneOcorenUseCase {

    private final OcorenGateway ocorenGateway;

    public DeleteOneOcorenUseCaseImpl(OcorenGateway ocorenGateway) {
        this.ocorenGateway = ocorenGateway;
    }

    @Override
    public void execute(UUID id) {
        ocorenGateway.deleteOne(id);
    }
}
