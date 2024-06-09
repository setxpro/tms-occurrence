package com.github.setxpro.tms_ocurrences.infra.database.models;

import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tb_ocoren")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class OcorenEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "codigo_rastreio")
    private String codigoRastreio;

    @Column(name = "numero_nfe")
    private String numeroNFe; // Número da Nota Fiscal Eletrônica

    @Column(name = "numero_cte")
    private String numeroCTe; // Número do CT-e Origem

    private String serie; // Série do CT-e Origem ? Série da Nota Fiscal Eletrônica ?
    private String data;
    private String hora;

    @Column(name = "cnpj_transportadora")
    private String cnpjTransportadora;

    @Column(name = "nome_recebedor")
    private String nomeRecebedor;

    @Column(name = "cnpj_pagador")
    private String cnpjPagador;

    private String codigo; // Código de Identificação da Ocorrência de Entrega
    private String ocorrencia; // Atributo com as Informações Pertinentes a Ocorrência de Entrega
    private String transportadora;

    @Column(name = "uf_destino")
    private String ufDestino;

    @Column(name = "cidade_destino")
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
        this.codigoRastreio = ocorenDTO.codigoRastreio();
    }
}
