import java.util.Scanner;

public class Cenario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String pacote = scanner.next();
		
		
		switch(pacote) {
			case "TURBO":{
				System.out.println("5gb youtube");
			}
			case "MIDIA":{
				System.out.println("whats e instagram gratis");
		
			}
			case "BASIC":{
				System.out.println("100 minutos de ligacao");
			}
		}
	}

}
