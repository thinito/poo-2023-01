package com.github.thinito.poo.t08;
public class Permissao {
    private Grupo grupo;
    private Arquivo arquivo;
    public Permissao(Grupo grupo, Arquivo arquivo) {
        this.grupo = grupo;
        this.arquivo = arquivo;
    }
}