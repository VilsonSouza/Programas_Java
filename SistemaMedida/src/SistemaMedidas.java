import java.util.Scanner;

public class SistemaMedidas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o tamanho:");
		String sigla = "P";
		
		// fazendo com condicional encadeada
		/*
		if(sigla == "P") {
			System.out.println("Pequeno");
		}
		else if(sigla =="M") {
			System.out.println("Medio");
		}
		else if(sigla =="G") {
			System.out.println("Grande");
		}
		else {
			System.out.println("Indefinido");
		}
		*/
		
		//fazendo com switch case
		switch(sigla) {
		case "P":{
			System.out.println("Pequeno");
			break;
		}
		case "M":{
			System.out.println("Medio");
			break;
		}
		case "G":{
			System.out.println("Grande");
			break;
		}
		default:{
			System.out.println("Indefinido");
		}
		}
	}

}
