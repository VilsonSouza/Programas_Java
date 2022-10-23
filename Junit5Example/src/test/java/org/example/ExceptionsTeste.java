package org.example;

import org.example.Conta;
import org.example.TransferenciaBancaria;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem= new Conta("1234567",0d);
        Conta contaDestino= new Conta("1098765",100.0);

        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                transferenciaBancaria.transfere(contaOrigem,contaDestino,-1));


    }

}
