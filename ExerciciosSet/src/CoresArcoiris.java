import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CoresArcoiris {

	public static void main(String[] args) {
		Set<String> cores= new HashSet<>() {{
			add("Vermelho");
			add("Laranja");
			add("Amarelo");
			add("Verde");
			add("Azul");
			add("Roxo");
			add("Violeta");
			
		}};
		
		// cores abaixo da outra
		for(String cor: cores) {
			System.out.println(cor);
		}
		//quantidade de cores
		System.out.println(cores.size());
		
		// ordem alfabetica
		Set<String> coresAlfabetica= new TreeSet<>(cores);
		System.out.println(coresAlfabetica);
		
		// ordem inversa
		Set<String> coresReversa= new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
		System.out.println(coresReversa);
		List<String>coresReversaString = new ArrayList<>(coresReversa);
		Collections.reverse(coresReversaString);
		System.out.println(coresReversaString);
		
		// cores com v
		for(String cor: cores) {
			if(cor.startsWith("V"))
			System.out.println(cor);
			
		}
		
		
		//remover cores com v
		for(String cor: cores) {
			if(cor.startsWith("V")) {
				cores.remove(cor);
			}
			System.out.println(cores);
			
			
		}
		//limpar o conjunto
		coresAlfabetica.clear();
		// conferir se esta vazio
		System.out.println(coresAlfabetica.isEmpty());
		
	}

}
