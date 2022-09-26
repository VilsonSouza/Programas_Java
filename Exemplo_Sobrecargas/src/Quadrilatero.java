
public class Quadrilatero {

public static void quadradosNotaveis(double lado){
		
		double area = lado*lado;
		
		System.out.println("Area do quadrado: "+area);
		
	}
	public static void quadradosNotaveis(double base,double altura){
		double area = base*altura;
		
		System.out.println("Area do retangulo: "+area);
	
	}
	public static void quadradosNotaveis(double base1, double base2, double altura){
	
		double op1 = (base1+base2)*altura;
		double area= op1/2;
		
		System.out.println("Area do trapezio: "+area);
	
	}
}
