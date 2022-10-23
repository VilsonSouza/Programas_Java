package org.example;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    // testes soma
    @Test
    public void DeveRetornarZeroQuandoNenhumValorForFornecido(){
        Calculator calculator = new Calculator();
        double sum =calculator.sum();

        Assertions.assertEquals(0,sum);// pois nao é somado nada
    }
    @Test
    public void DeveRetornarASomaDeTodosOsValores(){
        Calculator calculator = new Calculator();
        double sum =calculator.sum(3,6);

        Assertions.assertEquals(9,sum);
    }
    // testando a raiz quadrada
    @Test
    public void EstouraUmaExcecaoSeONumeroForMenorQueZero(){
        Calculator calculator = new Calculator();

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.squareRoot(-1));

        Assertions.assertEquals("Nao existe raiz real de negativos",exception.getMessage());
    }
}
