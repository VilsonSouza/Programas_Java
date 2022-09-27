package quadrilaterosNotaveis;

import java.util.Scanner;

public class quadrilaterosNotaveisRetorno {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		float n1,n2,n3,n4,n5,n6;
		
		
		//calculo quadrado
		System.out.println("Insira o valor do lado: ");
		n1 =leitura.nextFloat();
		
		//calculo retangulo
		System.out.println("Insira o valor da base : ");
		n2 =leitura.nextFloat();
		
		System.out.println("Insira o valor da altura: ");
		n3 =leitura.nextFloat();
		
		//calculo trapezio
		System.out.println("Insira o valor da base maior : ");
		n4 =leitura.nextFloat();
		
		System.out.println("Insira o valor da base menor: ");
		n5 =leitura.nextFloat();
		
		System.out.println("Insira o valor da altura: ");
		n6 =leitura.nextFloat();
		
		
		double areaQuadrado=operacoeQuadrilateros.quadrilateroNotavel(n1);
		System.out.println("Area do quadrado: "+areaQuadrado);
		
		double areaRetangulo=operacoeQuadrilateros.quadrilateroNotavel(n2, n3);
		System.out.println("Area do retangulo: "+areaRetangulo);
		
		double areaTrapezio=operacoeQuadrilateros.quadrilateroNotavel(n4, n5, n6);
		System.out.println("Area do trapezio: "+areaTrapezio);
	}

}
