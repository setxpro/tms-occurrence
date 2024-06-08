package com.github.setxpro.tms_ocurrences.domain.core.usecases;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;

import java.util.List;

public class FindAllOcorenUseCaseImpl implements FindAllOcorenUseCase {

    private final OcorenGateway ocorenGateway;

    public FindAllOcorenUseCaseImpl(OcorenGateway ocorenGateway) {
        this.ocorenGateway = ocorenGateway;
    }

    @Override
    public List<Ocoren> execute() {
        return ocorenGateway.findAll();
    }
}
