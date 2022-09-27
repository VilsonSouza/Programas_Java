package quadrilaterosNotaveis;

public class operacoeQuadrilateros {
		public static double quadrilateroNotavel(double lado){
			double area = lado*lado;
			return area;
		}
		public static double quadrilateroNotavel(double base, double altura) {
			double area = base*altura;
			return area;
			
		}
		public static double quadrilateroNotavel(double base1, double base2, double altura) {
			double op1 = (base1+base2)*altura;
			double area= op1/2;
			
			return area;
		}
		
		
	
	

}
