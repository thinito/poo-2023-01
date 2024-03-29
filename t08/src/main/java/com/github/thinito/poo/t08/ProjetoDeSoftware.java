package com.github.thinito.poo.t08;
import java.util.ArrayList;
public class ProjetoDeSoftware {
    public String nomeDoProjeto;
    public ArrayList<LinguagemDeProgramacao> linguagensDeProgramacao = new ArrayList<LinguagemDeProgramacao>();
    public ProjetoDeSoftware(String nomeDoProjeto, ArrayList linguagensDeProgramacao) {
        this.nomeDoProjeto = nomeDoProjeto;
        this.linguagensDeProgramacao = linguagensDeProgramacao;
    }
    public String toString() {
        return "Nome do projeto: " + nomeDoProjeto + "\nLinguagens utilizadas: " + linguagensDeProgramacao;
    }
}