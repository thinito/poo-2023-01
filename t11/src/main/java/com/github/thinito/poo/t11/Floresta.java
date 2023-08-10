package com.github.thinito.poo.t11;
import java.util.ArrayList;
import java.util.List;

class TipoFolha {
    private String forma;
    public TipoFolha(String forma) {
        this.forma = forma;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
}

class Folha {
    private TipoFolha tipo;
    public Folha(TipoFolha tipo) {
        this.tipo = tipo;
    }
    public TipoFolha getTipo() {
        return tipo;
    }
    public void setTipo(TipoFolha tipo) {
        this.tipo = tipo;
    }
}

class Arvore {
    private List<Folha> folhas;
    public Arvore() {
        folhas = new ArrayList<>();
    }
    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }
    public List<Folha> getFolhas() {
        return folhas;
    }
}

class Floresta {
    private List<Arvore> arvores;
    public Floresta() {
        arvores = new ArrayList<>();
    }
    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }
    public List<Arvore> getArvores() {
        return arvores;
    }
    public static void floresta (String[] args) {
        TipoFolha tipo1 = new TipoFolha("Forma 1");
        TipoFolha tipo2 = new TipoFolha("Forma 2");
        Folha folha1 = new Folha(tipo1);
        Folha folha2 = new Folha(tipo2);
        Folha folha3 = new Folha(tipo1);
        Arvore arvore1 = new Arvore();
        arvore1.adicionarFolha(folha1);
        arvore1.adicionarFolha(folha2);
        Arvore arvore2 = new Arvore();
        arvore2.adicionarFolha(folha3);
        Floresta floresta = new Floresta();
        floresta.adicionarArvore(arvore1);
        floresta.adicionarArvore(arvore2);
        List<Arvore> arvores = floresta.getArvores();
        for (Arvore arvore : arvores) {
            List<Folha> folhas = arvore.getFolhas();
            for (Folha folha : folhas) {
                TipoFolha tipoFolha = folha.getTipo();
                System.out.println("Folha: " + tipoFolha.getForma());
            }
        }
    }
}

