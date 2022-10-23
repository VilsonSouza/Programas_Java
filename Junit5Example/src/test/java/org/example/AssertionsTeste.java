package org.example;

import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;

public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int[]primeiroLancamento= {10,20,30,40,50};
        int[]segundoLancamento= {-1,5,2,3,10};

        Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);


    }
    @Test
    void validarObjetoNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);

    }
    @Test
    void validarLancamentosDiferentes(){
        int[]primeiroLancamento= {10,20,30,40,50};
        int[]segundoLancamento= {-1,5,2,3,10};

        Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double valor2= 5.0;
        assertEquals(valor,valor2);
    }


}
