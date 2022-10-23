package org.example;

public class TransferenciaBancaria {
    public void transfere(Conta contaOrigiem,Conta contaDestino, int valor){
        if(valor <=0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
}
