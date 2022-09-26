import java.util.Scanner;

public class Empréstimo {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o valor emprestado: ");
		float valor = leitura.nextFloat();
		
		System.out.println("Insira a quantidade de parcelas: ");
		int parcelas = leitura.nextInt();
		
		
		Emprestimo(parcelas, valor);
		
		
		
		
	}
	public static void Emprestimo(int quantParcelas,double valorInicial) {
		if(quantParcelas==2) {
			double emprestimo = valorInicial+(valorInicial*0.3);
			System.out.println("Valor final 2 parcelas: "+emprestimo);
			
		}
		else if(quantParcelas==3) {
			double emprestimo = valorInicial+(valorInicial*0.45);
			System.out.println("Valor final 3 parcelas: "+emprestimo);
			
		}
		else {
			System.out.println("Quantidade de parcelas não aceita");
		}
		
	
		
		
	}
	
	
	

}
