package com.dcc.ufjf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalVisitorTest {

    @Test
    void deveExibirCachorro() {
        Cachorro cachorro = new Cachorro("Calabreso", "Labrador");

        AnimalVisitor visitor = new AnimalVisitor();
        assertEquals("Cachorro: Calabreso (Raça: Labrador)", visitor.exibirCachorro(cachorro));
    }

    @Test
    void deveExibirGato() {
        Gato gato = new Gato("Whiskers", "Branco");

        AnimalVisitor visitor = new AnimalVisitor();
        assertEquals("Gato: Whiskers (Cor da Pelagem: Branco)", visitor.exibirGato(gato));
    }
}

