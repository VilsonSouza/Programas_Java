import java.util.Locale;
import java.util.Scanner;

public class Mensagem {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira a hora do dia: ");
		float hora = leitura.nextFloat();
		
		horaDia(hora);
		
		
	}
	public static void horaDia(float hora) {
		if(hora>=5 || hora <=12) {
			System.out.println("Bom dia");
		}
		else if(hora>12 && hora<=18) {
			System.out.println("Boa tarde");
		}
		else if(hora<=4 || hora>18){
			System.out.println("Boa noite");
		}
	}
	
	

}
