package com.github.thinito.poo.t11;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Prestacao {
    private double valor;
    private Date dataLimite;
    public Prestacao(double valor, Date dataLimite) {
        this.valor = valor;
        this.dataLimite = dataLimite;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Date getDataLimite() {
        return dataLimite;
    }
    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
}

class Compra {
    private String descricao;
    private List<Prestacao> prestacoes;
    public Compra(String descricao) {
        this.descricao = descricao;
        prestacoes = new ArrayList<>();
    }
    public void adicionarPrestacao(Prestacao prestacao) {
        prestacoes.add(prestacao);
    }
    public void listarPrestacoes() {
        System.out.println("Prestações da compra \"" + descricao + "\":");
        for (Prestacao prestacao : prestacoes) {
            System.out.println("- Valor: R$" + prestacao.getValor() + " | Data Limite: " + prestacao.getDataLimite());
        }
    }
}

class Carne {
    private Compra compra;
    public Carne(Compra compra) {
        this.compra = compra;
    }
    public Compra getCompra() {
        return compra;
    }
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    public static void carne(String[] args) {
        Prestacao prestacao1 = new Prestacao(150.0, new Date());
        Prestacao prestacao2 = new Prestacao(200.0, new Date());
        Prestacao prestacao3 = new Prestacao(100.0, new Date());
        Compra compra = new Compra("Eletrônicos");
        compra.adicionarPrestacao(prestacao1);
        compra.adicionarPrestacao(prestacao2);
        compra.adicionarPrestacao(prestacao3);
        Carne carne = new Carne(compra);
        Compra compraCarne = carne.getCompra();
        compraCarne.listarPrestacoes();
    }
}

