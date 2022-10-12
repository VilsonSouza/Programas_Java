public class Carro {
    private String cor;
    private String modelo;
    private Integer capacidadeTanque;

    // construtor
    public Carro(String cor, String modelo, Integer capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public Integer getCapacidadeTanque() {

        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {

        this.capacidadeTanque = capacidadeTanque;
    }
    // abaixo de getters and setters, legibilidade
    private double ValorTotal(double valorGasolina){
        return capacidadeTanque*valorGasolina;
    }
}
