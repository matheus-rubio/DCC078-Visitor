package com.dcc.ufjf;

public class Cachorro implements Animal {
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getNome() {
        return this.nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCachorro(this);
    }
}
