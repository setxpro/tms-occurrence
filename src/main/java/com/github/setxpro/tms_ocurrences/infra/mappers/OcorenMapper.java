package com.github.setxpro.tms_ocurrences.infra.mappers;

import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import com.github.setxpro.tms_ocurrences.infra.database.models.OcorenEntity;
import org.springframework.stereotype.Component;

@Component
public class OcorenMapper {
    public OcorenEntity toEntity(Ocoren ocoren) {
        return new OcorenEntity(
                ocoren.getId(),
                ocoren.getCodigoRastreio(),
                ocoren.getNumeroNFe(),
                ocoren.getNumeroCTe(),
                ocoren.getSerie(),
                ocoren.getData(),
                ocoren.getHora(),
                ocoren.getCnpjTransportadora(),
                ocoren.getNomeRecebedor(),
                ocoren.getCnpjPagador(),
                ocoren.getCodigo(),
                ocoren.getOcorrencia(),
                ocoren.getTransportadora(),
                ocoren.getUfDestino(),
                ocoren.getCidadeDestino(),
                ocoren.getDescricao()
        );
    }
    public Ocoren toDomainEntity(OcorenEntity ocoren) {
        return new Ocoren(
                ocoren.getId(),
                ocoren.getCodigoRastreio(),
                ocoren.getNumeroNFe(),
                ocoren.getNumeroCTe(),
                ocoren.getSerie(),
                ocoren.getData(),
                ocoren.getHora(),
                ocoren.getCnpjTransportadora(),
                ocoren.getNomeRecebedor(),
                ocoren.getCnpjPagador(),
                ocoren.getCodigo(),
                ocoren.getOcorrencia(),
                ocoren.getTransportadora(),
                ocoren.getUfDestino(),
                ocoren.getCidadeDestino(),
                ocoren.getDescricao()
        );
    }
}
