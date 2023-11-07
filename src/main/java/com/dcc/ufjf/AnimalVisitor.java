package com.dcc.ufjf;

public class AnimalVisitor implements Visitor {
    
    public String exibir(Animal animal) {
        return animal.aceitar(this);
    }

    @Override
    public String exibirCachorro(Cachorro cachorro) {
        return "Cachorro: " + cachorro.getNome() + " (Raça: " + cachorro.getRaca() + ")";
    }

    @Override
    public String exibirGato(Gato gato) {
        return "Gato: " + gato.getNome() + " (Cor da Pelagem: " + gato.getCorPelagem() + ")";
    }
}