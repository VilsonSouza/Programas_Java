package org.example;

public class Conta {
    private String numeroConta;
    private Double Saldo;

    public Conta(String numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        Saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }
}
