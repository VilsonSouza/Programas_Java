
public class Exercicios_operadores_aritmeticos {

	public static void main(String[] args) {
		System.out.println("Pre e pos: ");
		prePos();
		System.out.println("Aritmetico: ");
		aritmetico();
		System.out.println("Atribuicao: ");
		atribuicao();
		System.out.println("precedencia: ");
		precedencia();
		
	}
	private static void prePos() {
		int k =10;
		
		int i = ++k;
		int j = k--;
		int x = k;
		
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("x: "+x);
	}
	private static void aritmetico() {
		int a = 12;
		int b =2;
		int c = 15;
		int d = 18;
		
		int op1 = a+b;
		int op2 = a-b;
		int op3 = a*b;
		int op4 = a/b;
		
		int op5 = ((a+b)*c)/2;
		
		System.out.println("Op1: "+op1);
		System.out.println("op2: "+op2);
		System.out.println("Op3: "+op3);
		System.out.println("Op4: "+op4);
		System.out.println("Op5: "+op5);
	}
	private static void atribuicao() {
		int a=3;
		int b=5;
		int c=12;
		
		int at1 =a;
		int at2 =+(a+at1);
		int at3 = at2 -= at1;
		int at4 = at1 *= at1;
		int at5 = at2 /= at1;
		int at6 = at2 %= at1;
		
		System.out.println("At1: "+at1);
		System.out.println("At2: "+at2);
		System.out.println("At3: "+at3);
		System.out.println("At4: "+at4);
		System.out.println("At5: "+at5);
		System.out.println("At6: "+at6);
		
		
		
	}
	private static void precedencia() {
		int a =10;
		int b =2;
		
		a = ((b++)+(b--)*b)+2;
		
		System.out.println(a);
		
		
	}

}
