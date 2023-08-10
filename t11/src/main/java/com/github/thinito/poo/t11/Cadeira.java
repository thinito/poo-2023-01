package com.github.thinito.poo.t11;

class Pessoa {
    private String nome;
    private String sexo;
    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

class Cadeira {
    private Pessoa proprietario;
    public Cadeira(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public Pessoa getProprietario() {
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public static void cadeira(String[] args) {
        Pessoa pessoa1 = new Pessoa("Mikael", "Masculino");
        Pessoa pessoa2 = new Pessoa("aline ", "Feminino");
        Cadeira cadeira1 = new Cadeira(pessoa1);
        Cadeira cadeira2 = new Cadeira(pessoa2);
        Pessoa proprietarioCadeira1 = cadeira1.getProprietario();
        Pessoa proprietarioCadeira2 = cadeira2.getProprietario();
        System.out.println("Proprietário da cadeira 1: " + proprietarioCadeira1.getNome() + " (" + proprietarioCadeira1.getSexo() + ")");
        System.out.println("Proprietário da cadeira 2: " + proprietarioCadeira2.getNome() + " (" + proprietarioCadeira2.getSexo() + ")");
    }
}
