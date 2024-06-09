package com.github.setxpro.tms_ocurrences.infra.gateways;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.domain.core.gateways.OcorenGateway;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenDeletionException;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenNotFoundException;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenUpdateException;
import com.github.setxpro.tms_ocurrences.domain.utils.CopyNumProperties;
import com.github.setxpro.tms_ocurrences.infra.database.models.OcorenEntity;
import com.github.setxpro.tms_ocurrences.infra.database.repositories.OcorenRepository;
import com.github.setxpro.tms_ocurrences.infra.mappers.OcorenMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class OcorenRepositoryGateway implements OcorenGateway {

    private final OcorenRepository ocorenRepository;
    private final OcorenMapper ocorenMapper;

    private final CopyNumProperties copyNumProperties;

    public OcorenRepositoryGateway(OcorenRepository ocorenRepository, OcorenMapper ocorenMapper, CopyNumProperties copyNumProperties) {
        this.ocorenRepository = ocorenRepository;
        this.ocorenMapper = ocorenMapper;
        this.copyNumProperties = copyNumProperties;
    }

    @Override
    public Ocoren create(List<OcorenDTO> ocorenDTO) {

        for (OcorenDTO list : ocorenDTO) {
             ocorenMapper.toDomainEntity(
                    ocorenRepository.save(
                            new OcorenEntity(list)
                    )
             );
             // Save | Create SLA
        }

        return null;

    }

    @Override
    public List<Ocoren> findAll() {
        return ocorenRepository
                .findAll()
                .stream()
                .map(ocorenMapper::toDomainEntity)
                .collect(Collectors.toList());
    }

    @Override
    public Ocoren findOne(UUID id) {
        Optional<OcorenEntity> ocoren = ocorenRepository.findById(id);

        if (ocoren.isEmpty()) {
            throw new OcorenNotFoundException(id);
        }
        return ocorenMapper.toDomainEntity(ocoren.get());
    }

    // PATCH
    @Override
    public Ocoren updateOne(UUID id, OcorenDTO ocorenDTO) {

        Ocoren entity = findOne(id);
        if (entity != null) {
            copyNumProperties.copy(ocorenDTO, entity);
            return ocorenMapper.toDomainEntity(
                    ocorenRepository.save(
                            ocorenMapper.toEntity(entity)
                    )
            );
        }
        throw new OcorenUpdateException(id);
    }

    @Override
    public void deleteOne(UUID id) {
        Ocoren entity = findOne(id);
        if (entity != null) {
            ocorenRepository.deleteById(id);
            return;
        }
        throw new OcorenDeletionException(id);
    }
}
