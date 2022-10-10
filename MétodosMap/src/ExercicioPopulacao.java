import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExercicioPopulacao {

	public static void main(String[] args) {
		Map<String, Integer>cidadesNordeste = new HashMap<>() {{
			put("PE",9616621);
			put("AL",3351543);
			put("CE",9187103);
			put("RN",3534265);
			
		}};
		
		System.out.println("Substituir a populacao do estado RN por 3.534.165");
		cidadesNordeste.put("RN", 3534165);
		System.out.println(cidadesNordeste.toString());
		
		System.out.println("Exibir a pouplacao de PE");
		System.out.println(cidadesNordeste.get("PE"));
		
		
		System.out.println("Conferir se o estado PB esta no dicionario, se nao adicionar PB- 4039277"+cidadesNordeste.containsKey("PB"));
		if(cidadesNordeste.containsKey("PB")==false){
			cidadesNordeste.put("PB",4039277);
		}
		System.out.println(cidadesNordeste.toString());
		
		System.out.println("Exibir na ordem que foi informado");
		Map<String, Integer>cidadesNordeste1 = new LinkedHashMap<>() {{
			put("PE",9616621);
			put("AL",3351543);
			put("CE",9187103);
			put("RN",3534265);
			
		}};
		System.out.println(cidadesNordeste1.toString());
		
		System.out.println("Exibir em ordem alfabetica");
		Map<String, Integer>cidadesNordeste2= new TreeMap<>(cidadesNordeste);
		
		System.out.println(cidadesNordeste2.toString());
		
		System.out.println("Estado com menor populacao e quantidade");
		Integer menorPopulacao = Collections.min(cidadesNordeste.values());
		
		String EstadoMenor = "";
		Set<Map.Entry<String,Integer>> entries = cidadesNordeste.entrySet();
		
		for(Map.Entry<String,Integer> entry:entries) {
			if(entry.getValue().equals(menorPopulacao)) {
				EstadoMenor = entry.getKey();
				System.out.println("estado com menor populacao: "+EstadoMenor+ "- "+menorPopulacao);
			}
		}
		
		System.out.println("Estado com maior populacao e quantidade");
		Integer maiorPopulacao = Collections.max(cidadesNordeste.values());
		String estadoMaior = "";
		Set<Map.Entry<String,Integer>> entries2 = cidadesNordeste.entrySet();
		
		for(Map.Entry<String,Integer> entry:entries) {
			if(entry.getValue().equals(maiorPopulacao)) {
				estadoMaior = entry.getKey();
				System.out.println("estado com maior populacao: "+estadoMaior+ "- "+maiorPopulacao);
			}
		}
		
		System.out.println("Soma da populacao desses estados");
		Integer soma=0;
		
		Iterator<Integer>iterator = cidadesNordeste.values().iterator();
		
		while(iterator.hasNext()) {
			soma += iterator.next();
			
		}
		System.out.println(soma);
		
		System.out.println("Media da populacao: "+soma/cidadesNordeste.values().size());
		
		
		System.out.println("Remova os estados com a pouplacao menor que 4.000.000");
		Iterator<Integer>iterator2 = cidadesNordeste.values().iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator2.next();
			if(next <4000000)iterator2.remove();
		}
		System.out.println(cidadesNordeste.toString());
		
		
		System.out.println("Apague o dicionario");
		cidadesNordeste2.clear();
		
		System.out.println("Dicionario esta vazio? "+cidadesNordeste2.isEmpty());
		
	}

}
