package com.dcc.ufjf;

public class Gato implements Animal {
    private String nome;
    private String corPelagem;

    public Gato(String nome, String corPelagem) {
        this.nome = nome;
        this.corPelagem = corPelagem;
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGato(this);
    }
}
