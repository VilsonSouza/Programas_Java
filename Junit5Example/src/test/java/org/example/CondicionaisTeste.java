package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.*;
import org.testng.annotations.Test;

public class CondicionaisTeste {
    @Test
    //@EnabledIfEnvironmentVariable(named="Usuários", matches= "Vilson Souza") verificando com if else
    //@EnabledOnOs(OS.LINUX)// HABILITAR EM UM OU MAIS SISTEMAS OPERACIONAIS
    //@EnabledOnOs({OS.LINUX,OS.MAC,OS.WINDOWS})//pode ser com array o teste
    //@EnabledForJreRange(min = JRE.JAVA_11,max=JRE.JAVA_18)// posso mudar as versões que meu teste funciona
    void validarAlgoSomenteNoUsuarioVIlson(){
        Assertions.assertEquals(10,5+5);
    }
}
