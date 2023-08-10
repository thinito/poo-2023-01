package com.github.thinito.poo.t08;
public class Endereco {
    private String rua;
    private String logradouro;
    private String cep;
    private Integer numeroDoLote;
    public Endereco(String rua, String logradouro, String cep, Integer numeroDoLote) {
        this.rua = rua;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numeroDoLote = numeroDoLote;
    }
}