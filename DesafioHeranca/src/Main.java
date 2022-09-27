import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		/*Vendedor joaoVendedor = 
				new Vendedor("Joao Silva","123456",10.0,5);
		
		double salarioJoao = joaoVendedor.calcularSalario();
		
		System.out.println("O salario de joao e: "+salarioJoao);
		
		Consultor mariaConsultor = 
				new Consultor("Maria Silva","32312341",100.0,10L);
		
		double salarioMaria = mariaConsultor.calcularSalario();

		System.out.println("O salario de maria e: "+salarioMaria);*/
		
		Scanner scanner = new Scanner(System.in);
		
		// valores para consultor
		System.out.println("Informe seu nome: ");
		
		String nome = scanner.next();
		
		System.out.println("Informe o cpf");
		String cpf = scanner.next();
		
		System.out.println("Informe o valor por hora: ");
		Double valorHora = scanner.nextDouble();
		
		System.out.println("Informe o tempo trabalhado");
		long tempoTrabalhado = scanner.nextLong();
		
		Consultor dadosConsultor= new Consultor(nome, cpf, valorHora,tempoTrabalhado);
		double salarioConsultor = dadosConsultor.calcularSalario();
		
		System.out.println("Salario do consultor: "+salarioConsultor);
		
		
				
	}
	

}
