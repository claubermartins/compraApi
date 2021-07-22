package com.compraApi.model;

public class ResponseTaxaSelic {
    private String data;
    private Double valor;

    public ResponseTaxaSelic(String data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }


}
