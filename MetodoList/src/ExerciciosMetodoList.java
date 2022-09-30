import java.util.LinkedList;

public class ExerciciosMetodoList extends ExemploList{
	public static void main(String[] args) {
		LinkedList<Double> notas2 = new LinkedList<Double>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0d);
		notas2.add(3.6);
		
		
		System.out.println("Primeiro elemento: "+notas2.get(0));
		System.out.println("Primeiro elemento: "+notas2.get(0)+notas2.remove(notas2.get(0)));
		
		System.out.println(notas2);
		
		
		
	}
}
