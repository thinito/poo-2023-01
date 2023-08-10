package com.github.thinito.ufg.poo.t013;

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        pessoa1.exibirInformacoes();
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        pessoa2.exibirInformacoes();
    }
}
