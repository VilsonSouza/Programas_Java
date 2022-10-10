import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DesafioMap {

	public static void main(String[] args) {
		int qtdLancamentos = 100;
		
		
		List<Integer> valores = new ArrayList<>();
		Random geradorLancamento = new Random();
		
		// Valores
		for(int i=0;i<qtdLancamentos;i++) {
			int val = geradorLancamento.nextInt(6)+1;
			valores.add(val);
		}
		System.out.println(valores.toString());
		
		// lancamentos
		Map<Integer, Integer> lancamentos = new HashMap<>();
		lancamentos.putAll(lancamentos);
		
		for (Integer resultado : valores) {
			if(lancamentos.containsKey(resultado)) {
				lancamentos.put(resultado, lancamentos.get(resultado)+1);
			}
			else lancamentos.put(resultado, 1);
		}
		System.out.println(lancamentos.toString());
	}

}

