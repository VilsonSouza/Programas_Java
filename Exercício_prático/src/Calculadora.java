import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leituraValor = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero");
		float num1 = leituraValor.nextInt();
		System.out.println("Insira o segundo numero");
		float num2 = leituraValor.nextInt();
		
		soma(num1,num2);
		
		System.out.println("Insira o primeiro numero");
		float num3 = leituraValor.nextInt();
		System.out.println("Insira o segundo numero");
		float num4 = leituraValor.nextInt();
		
		subtracao(num3,num4);
		
		System.out.println("Insira o primeiro numero");
		float num5 = leituraValor.nextInt();
		System.out.println("Insira o segundo numero");
		float num6 = leituraValor.nextInt();
		
		multiplicacao(num5, num6);
		
		System.out.println("Insira o primeiro numero");
		float num7 = leituraValor.nextInt();
		System.out.println("Insira o segundo numero");
		float num8 = leituraValor.nextInt();
		
		divisao(num7, num8);
		
		
	}
	
	public static float soma(float n1, float n2) {
	
		
		float soma =n1+n2;
		
		System.out.println("Valor da soma: "+soma);
		return soma;
	}
	public static float subtracao(float n1, float  n2) {
		float subtracao= n1-n2;
		
		System.out.println("Valor da subtracao: "+subtracao);
		return subtracao;
	}
	public static float multiplicacao(float n1,float n2) {
		float multiplicacao = n1*n2;
		System.out.println("Valor da multiplicacao: "+multiplicacao);
		return multiplicacao;
	}
	public static float divisao (float n1, float n2) {
		float divisao = n1/n2;
		System.out.println("Valor da divisao: "+divisao);
		return divisao;
	}

}
