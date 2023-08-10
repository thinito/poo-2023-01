package com.github.thinito.poo.t11;

class Funcionario {
    private String nome;
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void trabalhar() {
        System.out.println("Funcionário " + nome + " está trabalhando na lanchonete.");
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }
    public void gerenciar() {
        System.out.println("Gerente " + getNome() + " está gerenciando a lanchonete.");
    }
}

class Lanchonetegerente {
    private Gerente gerente;
    private Funcionario funcionario;
    public Lanchonetegerente(Gerente gerente, Funcionario funcionario) {
        this.gerente = gerente;
        this.funcionario = funcionario;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João");
        Gerente gerente = new Gerente("Carlos");
        Lanchonetegerente lanchonete = new Lanchonetegerente(gerente, funcionario1);
        Gerente gerenteLanchonete = lanchonete.getGerente();
        Funcionario funcionarioLanchonete = lanchonete.getFuncionario();
        gerenteLanchonete.gerenciar();
        funcionarioLanchonete.trabalhar();
    }
}

