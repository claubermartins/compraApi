package com.compraApi.model;


import java.util.List;

public class ResponseCompra  {
    List<Parcela> parcelas;

    public ResponseCompra(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

}
