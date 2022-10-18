import javax.swing.*;

public class Main {
    public static void main(String[] args) {

      boolean continueLooping = true;

      do{
          String a = JOptionPane.showInputDialog("Numerador: ");
          String b = JOptionPane.showInputDialog("Denominador");
          try{
              double resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
              System.out.println("Resultado: "+resultado);
              continueLooping = false;
          }
          catch(NumberFormatException e){
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, "Input invalido, informe um numero inteiro");

          }catch(ArithmeticException f){
              f.printStackTrace();
              JOptionPane.showMessageDialog(null, "Impossivel dividir um numero por zero");
          }

      }while(continueLooping);
    }
    public static double dividir(double a, double b){return a/b;}
}