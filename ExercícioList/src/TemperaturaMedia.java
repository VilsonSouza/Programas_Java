import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Temperaturas> temperaturas = new ArrayList<Temperaturas>();
		temperaturas.add(new Temperaturas(0));
		temperaturas.add(new Temperaturas(0));
		temperaturas.add(new Temperaturas(0));
		temperaturas.add(new Temperaturas(0));
		temperaturas.add(new Temperaturas(0));
		temperaturas.add(new Temperaturas(0));
		
		
		Iterator<Temperaturas> iterator =temperaturas.iterator();
		
		while(iterator.hasNext()) {
			
		}
		
		
		
		
		
	}

}

class Temperaturas {
	private double temperatura;

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public Temperaturas(double temperatura) {
		super();
		this.temperatura = temperatura;
	}
	
	
	
	
}


