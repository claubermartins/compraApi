package com.compraApi.model;

public class Produto {
    private String codigo;
    private String nome;
    private String valor;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getValor() {
        return valor;
    }

    public Produto(String codigo, String nome, String valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    public Produto (){
    }
    }

