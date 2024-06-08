package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;

import java.util.UUID;

public class UpdateOneOcorenUseCaseImpl implements UpdateOneOcorenUseCase {

    private final OcorenGateway ocorenGateway;

    public UpdateOneOcorenUseCaseImpl(OcorenGateway ocorenGateway) {
        this.ocorenGateway = ocorenGateway;
    }

    @Override
    public Ocoren execute(UUID id, OcorenDTO ocorenDTO) {
        return ocorenGateway.updateOne(id, ocorenDTO);
    }
}
