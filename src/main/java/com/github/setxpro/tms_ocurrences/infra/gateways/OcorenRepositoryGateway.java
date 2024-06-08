package com.github.setxpro.tms_ocurrences.infra.gateways;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class OcorenRepositoryGateway implements OcorenGateway {
    @Override
    public Ocoren create(List<OcorenDTO> ocorenDTO) {
        return null;
    }

    @Override
    public List<Ocoren> findAll() {
        return List.of();
    }

    @Override
    public Ocoren findOne(UUID id) {
        return null;
    }

    @Override
    public Ocoren updateOne(UUID id, OcorenDTO ocorenDTO) {
        return null;
    }

    @Override
    public void deleteOne(UUID id) {

    }
}
