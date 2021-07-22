package com.compraApi.model;

public class Parcela {
    private String numeroParcela;
    private String valor;
    private String taxaJurosAoMes;

    public Parcela(String numeroParcela, String valor, String taxaJurosAoMes) {
        this.numeroParcela = numeroParcela;
        this.valor = valor;
        this.taxaJurosAoMes = taxaJurosAoMes;
    }

    public void setNumeroParcela(String numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setTaxaJurosAoMes(String taxaJurosAoMes) {
        this.taxaJurosAoMes = taxaJurosAoMes;
    }

    public String getNumeroParcela() {
        return numeroParcela;
    }

    public String getValor() {
        return valor;
    }

    public String getTaxaJurosAoMes() {
        return taxaJurosAoMes;
    }

}
