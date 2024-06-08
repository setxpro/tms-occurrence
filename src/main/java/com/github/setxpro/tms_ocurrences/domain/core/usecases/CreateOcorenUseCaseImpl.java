package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;

import java.util.List;

public class CreateOcorenUseCaseImpl implements CreateOcorenUseCase {

    private final OcorenGateway ocorenGateway;

    public CreateOcorenUseCaseImpl(OcorenGateway ocorenGateway) {
        this.ocorenGateway = ocorenGateway;
    }

    @Override
    public Ocoren execute(List<OcorenDTO> ocorenDTO) {
        return ocorenGateway.create(ocorenDTO);
    }
}
