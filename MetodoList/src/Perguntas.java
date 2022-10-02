import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perguntas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<String>perguntas = new ArrayList<String>();
		
		System.out.println("Telefonou para a vitima? ");
		perguntas.add(scanner.next());
		
		System.out.println("Esteve no local do crime? ");
		perguntas.add(scanner.next());
		
		System.out.println("Mora perto da vítima? ");
		perguntas.add(scanner.next());
		
		System.out.println("Devia para a vitima? ");
		perguntas.add(scanner.next());
		
		
		System.out.println("Ja trabalhou com a vitima? ");
		perguntas.add(scanner.next());
		
		
		
	}
	
	
	
	
	
}
