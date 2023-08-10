package com.github.thinito.poo.t11;
import java.util.ArrayList;
import java.util.List;

class Compartimento {
    private List<String> livros;
    private List<String> cds;
    public Compartimento() {
        livros = new ArrayList<>();
        cds = new ArrayList<>();
    }
    public void adicionarLivro(String livro) {
        if (livros.size() < 3) {
            livros.add(livro);
            System.out.println("Livro \"" + livro + "\" adicionado ao compartimento.");
        } else {
            System.out.println("Não é possível adicionar mais livros ao compartimento.");
        }
    }
    public void adicionarCD(String cd) {
        cds.add(cd);
        System.out.println("CD \"" + cd + "\" adicionado ao compartimento.");
    }
    public void listarLivros() {
        System.out.println("Livros no compartimento:");
        for (String livro : livros) {
            System.out.println("- " + livro);
        }
    }
    public void listarCDs() {
        System.out.println("CDs no compartimento:");
        for (String cd : cds) {
            System.out.println("- " + cd);
        }
    }
}

class Prateleira {
    private List<Compartimento> compartimentos;
    public Prateleira() {
        compartimentos = new ArrayList<>();
    }
    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
        System.out.println("Compartimento adicionado à prateleira.");
    }
    public void listarCompartimentos() {
        System.out.println("Compartimentos na prateleira:");
        for (int i = 0; i < compartimentos.size(); i++) {
            System.out.println("- Compartimento " + (i + 1));
            Compartimento compartimento = compartimentos.get(i);
            compartimento.listarLivros();
            compartimento.listarCDs();
        }
    }
}

class Armario {
    private List<Prateleira> prateleiras;
    public Armario() {
        prateleiras = new ArrayList<>();
    }
    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
        System.out.println("Prateleira adicionada ao armário.");
    }
    public void listarPrateleiras() {
        System.out.println("Prateleiras no armário:");
        for (int i = 0; i < prateleiras.size(); i++) {
            System.out.println("- Prateleira " + (i + 1));
            Prateleira prateleira = prateleiras.get(i);
            prateleira.listarCompartimentos();
        }
    }
}

