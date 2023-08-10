package com.github.thinito.poo.t11;
import java.util.Date;

class Data {
    private Date data;
    public Data(Date data) {
        this.data = data;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}

class Periodo {
    private Data dataInicial;
    private Data dataFinal;
    public Periodo(Data dataInicial, Data dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
    public Data getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Data dataInicial) {
        this.dataInicial = dataInicial;
    }
    public Data getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Data dataFinal) {
        this.dataFinal = dataFinal;
    }
    public static void periodo(String[] args) {
        Date dataInicial = new Date();
        Date dataFinal = new Date();
        Data dataInicio = new Data(dataInicial);
        Data dataFim = new Data(dataFinal);
        Periodo periodo = new Periodo(dataInicio, dataFim);
        Data dataInicialPeriodo = periodo.getDataInicial();
        Data dataFinalPeriodo = periodo.getDataFinal();
        System.out.println("Data inicial: " + dataInicialPeriodo.getData());
        System.out.println("Data final: " + dataFinalPeriodo.getData());
    }
}


