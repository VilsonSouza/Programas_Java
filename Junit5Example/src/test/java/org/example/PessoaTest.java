package org.example;

import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void calcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica",LocalDateTime
                .of(2000,1,1,15,0,0));
        Assertions.assertEquals(22,jessica.getIdade());
    }

    @Test
    void retornaMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica",LocalDateTime
                .of(2000,1,1,15,0,0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }
}
