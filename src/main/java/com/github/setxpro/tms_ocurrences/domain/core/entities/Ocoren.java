package com.github.setxpro.tms_ocurrences.domain.core.entities;

import java.util.UUID;

public class Ocoren {
    private UUID id;
    private String codigoRastreio;
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

    public Ocoren(UUID id, String codigoRastreio, String numeroNFe, String numeroCTe, String serie, String data, String hora, String cnpjTransportadora, String nomeRecebedor, String cnpjPagador, String codigo, String ocorrencia, String transportadora, String ufDestino, String cidadeDestino, String descricao) {
        this.id = id;
        this.codigoRastreio = codigoRastreio;
        this.numeroNFe = numeroNFe;
        this.numeroCTe = numeroCTe;
        this.serie = serie;
        this.data = data;
        this.hora = hora;
        this.cnpjTransportadora = cnpjTransportadora;
        this.nomeRecebedor = nomeRecebedor;
        this.cnpjPagador = cnpjPagador;
        this.codigo = codigo;
        this.ocorrencia = ocorrencia;
        this.transportadora = transportadora;
        this.ufDestino = ufDestino;
        this.cidadeDestino = cidadeDestino;
        this.descricao = descricao;
    }

    public Ocoren() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public String getNumeroNFe() {
        return numeroNFe;
    }

    public void setNumeroNFe(String numeroNFe) {
        this.numeroNFe = numeroNFe;
    }

    public String getNumeroCTe() {
        return numeroCTe;
    }

    public void setNumeroCTe(String numeroCTe) {
        this.numeroCTe = numeroCTe;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCnpjTransportadora() {
        return cnpjTransportadora;
    }

    public void setCnpjTransportadora(String cnpjTransportadora) {
        this.cnpjTransportadora = cnpjTransportadora;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public String getCnpjPagador() {
        return cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
