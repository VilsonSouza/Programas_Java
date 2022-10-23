package org.example;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    @Test
    void validadrAlgoSomenteNoMeuUsuario(){
        Assumptions.assumeTrue("Vilson Souza".equals(System.getenv("Usuario")));// assuma que seja verdadeiro
        Assumptions.assumeFalse("Vilson Souza".equals(System.getenv("Usuario")));// assuma que seja verdadeiro

    }
}
