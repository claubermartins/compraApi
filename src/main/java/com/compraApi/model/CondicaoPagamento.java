package com.compraApi.model;

public class CondicaoPagamento {

    private String qtdeParcelas;
    private String valorEntrada;

    public CondicaoPagamento(String valorEntrada, String qtdeParcelas) {
        this.valorEntrada = valorEntrada;
        this.qtdeParcelas = qtdeParcelas;
    }

    public void setValorEntrada(String valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public void setQtdeParcelas(String qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public String getValorEntrada() {
        return valorEntrada;
    }

    public String getQtdeParcelas() {
        return qtdeParcelas;
    }

    public CondicaoPagamento() {
    }

}
