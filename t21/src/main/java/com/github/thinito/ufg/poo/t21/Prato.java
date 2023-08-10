package com.github.thinito.ufg.poo.t21;

import java.util.Set;

public class Prato {
    private Preco preco;
    private String nome;
    private Set<DiaDaSemana> dias;
    public boolean servidoEm(DiaDaSemana dia) {
        for (DiaDaSemana servido : dias) {
            if (servido == dia) {
                return true;
            }
        }
        return false;
    }
}
