package org.example;

import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) testando por ordem que pedimos
//@TestMethodOrder(MethodOrderer.MethodName.class) // na ordem alfabetica
// @TestMethodOrder(MethodOrderer.Random.class) ou podemos usar aleatoriamente
@TestMethodOrder(MethodOrderer.DisplayName.class) // ordem pelo display
public class EscolhendoAOrdemTeste {

    @DisplayName("teste1")
    //@Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    @DisplayName("Teste2")
    //@Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    @DisplayName("Teste3")
    //@Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }
    @DisplayName("Teste4")
   // @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

}
