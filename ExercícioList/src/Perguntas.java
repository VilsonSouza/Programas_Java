import java.util.ArrayList;
import java.util.List;


public class Perguntas {
	public static void main(String[] args) {
		
		
		List<String>perguntas = new ArrayList<String>();
		
		perguntas.add("s");
		perguntas.add("s");
		perguntas.add("s");
		perguntas.add("s");
		perguntas.add("s");
		
		int quant =0;
		for(int i=0;i<perguntas.size();i++) {
			if(perguntas.get(i)=="s") {
				quant++;
			}
		}
		if(quant ==2) {
			System.out.println("Suspeita");
		}
		else if(quant==3 || quant==4) {
			System.out.println("Cumplice");
		}
		else if(quant==5) {
			System.out.println("Assassina");
		}
		else {
			System.out.println("Inocente");
		}
	}
	
	
	
	
	
}
