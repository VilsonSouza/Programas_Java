package org.example;

import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuracao");
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new
                Pessoa("Joao", LocalDateTime.of(2000,1,1,13,0)));



    }
    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new
                Pessoa("Joao", LocalDateTime.of(2000,1,1,13,0)));

    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Finalizou conexao");
    }
}
