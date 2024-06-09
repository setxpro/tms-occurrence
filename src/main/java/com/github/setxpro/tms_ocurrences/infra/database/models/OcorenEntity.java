package com.github.setxpro.tms_ocurrences.infra.database.models;

import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "ocoren")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class OcorenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String numeroNFe; // Número da Nota Fiscal Eletrônica
    private String numeroCTe; // Número do CT-e Origem
    private String serie; // Série do CT-e Origem ? Série da Nota Fiscal Eletrônica ?
    private String data; //
    private String hora;
    private String cnpjTransportadora;
    private String nomeRecebedor;
    private String cnpjPagador;
    private String codigo; // Código de Identificação da Ocorrência de Entrega
    private String ocorrencia; // Atributo com as Informações Pertinentes a Ocorrência de Entrega
    private String transportadora;
    private String ufDestino;
    private String cidadeDestino;
    private String descricao; // Descrição Resumida da Ocorrência de Entrega

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }

    public OcorenEntity(OcorenDTO ocorenDTO) {
        this.descricao = ocorenDTO.descricao();
        this.cidadeDestino = ocorenDTO.cidadeDestino();
        this.ufDestino = ocorenDTO.ufDestino();
        this.transportadora = ocorenDTO.transportadora();
        this.ocorrencia = ocorenDTO.ocorrencia();
        this.codigo = ocorenDTO.codigo();
        this.cnpjPagador = ocorenDTO.cnpjPagador();
        this.nomeRecebedor = ocorenDTO.nomeRecebedor();
        this.cnpjTransportadora = ocorenDTO.cnpjTransportadora();
        this.hora = ocorenDTO.hora();
        this.data = ocorenDTO.data();
        this.serie = ocorenDTO.serie();
        this.numeroCTe = ocorenDTO.numeroCTe();
        this.numeroNFe = ocorenDTO.numeroNFe();
    }
}
