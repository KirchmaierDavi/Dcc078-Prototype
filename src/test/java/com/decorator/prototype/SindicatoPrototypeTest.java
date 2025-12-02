package com.decorator.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SindicatoPrototypeTest {

    @Test
    void deveClonarSindicatoTrabalhadores() {
        SindicatoTrabalhadoresPrototype sindicatoOriginal =
                new SindicatoTrabalhadoresPrototype("Sindicato dos Metalúrgicos", "Trabalhadores", 150.0);

        SindicatoPrototype sindicatoClone = sindicatoOriginal.clone();

        assertNotSame(sindicatoOriginal, sindicatoClone);
        assertEquals(sindicatoOriginal.getNome(), sindicatoClone.getNome());
        assertEquals(sindicatoOriginal.getCategoria(), sindicatoClone.getCategoria());
        assertEquals(sindicatoOriginal.getMensalidade(), sindicatoClone.getMensalidade());
    }

    @Test
    void deveClonarSindicatoPatronal() {
        SindicatoPatronalPrototype sindicatoOriginal =
                new SindicatoPatronalPrototype("Sindicato Patronal do Comércio", "Empregadores", 300.0);

        SindicatoPrototype sindicatoClone = sindicatoOriginal.clone();

        assertNotSame(sindicatoOriginal, sindicatoClone);
        assertEquals(sindicatoOriginal.getNome(), sindicatoClone.getNome());
        assertEquals(sindicatoOriginal.getCategoria(), sindicatoClone.getCategoria());
        assertEquals(sindicatoOriginal.getMensalidade(), sindicatoClone.getMensalidade());
    }

    @Test
    void devePermitirAlterarCloneSemImpactarOriginal() {
        SindicatoTrabalhadoresPrototype sindicatoOriginal =
                new SindicatoTrabalhadoresPrototype("Sindicato dos Professores", "Trabalhadores", 120.0);

        SindicatoPrototype sindicatoClone = sindicatoOriginal.clone();
        sindicatoClone.setMensalidade(200.0);

        assertNotEquals(sindicatoOriginal.getMensalidade(), sindicatoClone.getMensalidade());
    }
}
