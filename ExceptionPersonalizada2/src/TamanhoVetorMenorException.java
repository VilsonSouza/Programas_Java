public class TamanhoVetorMenorException extends Exception{
    private int numerador;
    private int denominador;

    public TamanhoVetorMenorException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "TamanhoVetorMenorException{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
