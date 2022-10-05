import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		/* dado os modelos de carros e seus respectivos consumos na estrada faça:
		 * modelo = gol - consumo =14,4 km/l
		 * modelo = uno - consumo = 15,6km/l
		 * modelo = mobi - consumo = 16,1km/l
		 * modelo = hb20 - consumo 14,5km/l
		 * modelo = kwid - consumo = 15,6 km/l
		 */
		
		
		// inicializar o map
		/*Map carrosPopulares202 = new HashMap(); antes do java 5
		 * Map<sting, Double> carrosPopulares = new HashMap<>();
		 * HashMap< String,Double> carrosPopulares = new HashMap<>();
		 * Map<String, Double> carrosPopulare2020= Map.of(valores);
		*/
		
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
		Map<String, Double> carrosPouplares = new HashMap<>() {{
			// trabalhando com map temos o put não o add
			put("gol", 14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		}};
		
		System.out.println(carrosPouplares.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2km/l");
		carrosPouplares.put("gol",15.2);
		
		System.out.println(carrosPouplares);
		
		
		System.out.println("Confira se o modelo tucson  esta no dicionario: "+carrosPouplares.containsKey("tucson"));
		
		System.out.println("Exibia o consumo do uno: "+carrosPouplares.get("uno"));
		
		System.out.println("Exiba o terceiro metodo adicionado: nao da");
		
		System.out.println("Exiba os modelos: ");
		Set<String>modelos =carrosPouplares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double>consumos = carrosPouplares.values();
		
		System.out.println(consumos);
		
		System.out.println("Exiba o modelo mais economio e seu consumo: ");
		Double consumoMaisEficente =Collections.max(carrosPouplares.values());
		
		Set<Map.Entry<String, Double>> entries =carrosPouplares.entrySet();
		
		String modeloMaisEficiente =""; //variavel de controle
		
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoMaisEficente)) {
				modeloMaisEficiente= entry.getKey();
				System.out.println("Modelo mais eficiente: "+modeloMaisEficiente+ " - "+consumoMaisEficente);
			}
		}
		
		System.out.println("Exiba o modelo menos economico e seu consumo");
		Double consumoMenosEficiente = Collections.min(carrosPouplares.values());
		
		String modeloMenosEficiente = "";
		Set<Map.Entry<String, Double>> entries2 = carrosPouplares.entrySet();
		for(Map.Entry<String, Double> entry: entries2) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente= entry.getKey();
				System.out.println("Modelo menos eficiente: "+modeloMenosEficiente+ "- "+consumoMenosEficiente);
			}
		}
		
		System.out.println("Exiba a soma dos consumos: ");
		//podemos usar o iterator direto das collections
		Iterator<Double>iterator = carrosPouplares.values().iterator();
		
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}
		System.out.println("Soma: "+soma);
		
		System.out.println("Exiba a media dos consumos"+ (soma/carrosPouplares.size()));
		
		System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
		Iterator<Double>iterator1 = carrosPouplares.values().iterator();
		
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) iterator1.remove();
				
		}
		System.out.println(carrosPouplares.toString());
		
		System.out.println("carros na ordem que informados");
		Map<String, Double> carrosPouplares1 = new LinkedHashMap<>() {{
			// trabalhando com map temos o put não o add
			put("gol", 14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		}};
		
		System.out.println(carrosPouplares1.toString());
		
		System.out.println("Dicionario ordenado pelo modelo: ");
		//ordem natural
		Map<String, Double>carrosPopulares2 = new TreeMap<>(carrosPouplares1);
		
		System.out.println(carrosPopulares2.toString());
		
		System.out.println("Apague o conjunto de carros: ");
		carrosPouplares.clear();
		
		System.out.println("Confira se a lista esta vazia: "+ carrosPouplares.isEmpty());
		
	}

}
