import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<Double>();
		temperaturas.add(35.3);
		temperaturas.add(34.2);
		temperaturas.add(40.1);
		temperaturas.add(33.7);
		temperaturas.add(32.5);
		temperaturas.add(33.5);
		
		
		
		
		Iterator<Double> iterator =temperaturas.iterator();
		
		double soma=0d;
		double media=0d;
		while(iterator.hasNext()) {
			Double next= iterator.next();
			soma=soma+next;
		}
		
		media=soma/temperaturas.size();
		// acima da media
		for(int i=0;i<temperaturas.size();i++) {
			if(temperaturas.get(i)>media) {
				System.out.println(temperaturas.get(i));
				if(i==0) {
					System.out.println("Mes de ocorencia: janeiro");
				}
				else if(i==1) {
					System.out.println("Mes de ocorencia: fevereiro");
				}
				else if(i==2) {
					System.out.println("Mes de ocorencia: marco");
				}
				else if(i==3) {
					System.out.println("Mes de ocorencia: abril");
				}
				else if(i==4) {
					System.out.println("Mes de ocorencia: maio");
				}
				else if(i==5) {
					System.out.println("Mes de ocorencia: junho");
				}
				
			}
			
		}
		
		
		
	}

}


	
	



