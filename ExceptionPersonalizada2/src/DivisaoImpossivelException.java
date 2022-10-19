public class DivisaoImpossivelException extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoImpossivelException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "DivisaoImpossivelException{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
