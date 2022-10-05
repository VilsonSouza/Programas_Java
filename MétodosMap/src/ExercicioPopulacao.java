import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
		
		System.out.println("Conferir se o estado PB esta no dicionario, se nao adicionar PB- 4039277"+cidadesNordeste.containsKey("PB"));
		if(cidadesNordeste.containsKey("PB")==false){
			cidadesNordeste.put("PB",4039277);
		}
		System.out.println(cidadesNordeste.toString());
		
		System.out.println("Exibir em ordem alfabetica");
		Map<String, Integer>cidadesNordeste2= new TreeMap<>(cidadesNordeste);
		
		System.out.println(cidadesNordeste2.toString());
		
		System.out.println("Estado com menor populacao e quantidade");
		Double menorPopulacao = Collections.min()
	}

}
