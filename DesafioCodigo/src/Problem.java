import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Problem {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
     
     System.out.println("Insira o codigo");
     int cod1 = leitor.nextInt();
     
     System.out.println("Insira a quantidade");
     int n1 = leitor.nextInt();
     
     System.out.println("Insira o valor: ");
     double valor1 = leitor.nextDouble();


     System.out.println("Insira o codigo");
     int cod2 = leitor.nextInt();
     
     System.out.println("Insira a quantidade");
     int n2= leitor.nextInt();
     
     System.out.println("Insira o valor: ");
     double valor2= leitor.nextDouble();
		
     double total = (valor1*n1)+(valor2*n2);
     System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total)); 
     leitor.close();  
    }
	
}