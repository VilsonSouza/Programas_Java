
public class exercicio_casting {

	public static void main(String[] args) {
		byte a;
		short b=12;
		int c=1203;
		long d= 1234L;
		float e= 312.44F;
		double f= 3213312.33331D;
		
		float b1;
		long b2;
		int b3 ;
		short b4;
		byte b5;
		
		//double para float
		b1 = (float)f;
		//float para long
		b2= (long)e;
		//long para int
		b3= (int)d;
		//int para short
		b4= (short)c;
		//short para byte
		b5=(byte)b;
		
		
		
		
		
		
		
		
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		
		
	}

}
