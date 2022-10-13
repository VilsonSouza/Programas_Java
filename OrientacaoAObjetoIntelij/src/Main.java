import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Azul","Corsa",50);

        System.out.println("Cor do carro "+carro.getCor()+
                " Modelo do carro "+carro.getModelo()+
                " Capacidade do tanque "+ carro.getCapacidadeTanque() );

        System.out.println("Valor para encher o tanque: "+carro.ValorTotal(6.46));
    }
}