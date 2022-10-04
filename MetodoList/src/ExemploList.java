import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {

	public static void main(String[] args) {
		// dada uma lista om 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:
		
		// formas de importar listas
		//List notas = new ArrayList(); // usada antes do java 5
		List<Double> notas = new ArrayList<Double>(); // diamond operator
		
		System.out.println("Crie uma lista e adicione as 7 notas: ");
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0d);
		notas.add(3.6);
		
		System.out.println(notas);
		
		System.out.println("Exibindo a posicao da nota 5.0: "+notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8 na posicao 4");
		
		notas.add(4,8d);
		
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0");
		notas.set(notas.indexOf(5d),6.0);
		
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 esta na lista: "+notas.contains(5d));
		
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		for(Double nota:notas) {
			System.out.println(nota);
		}
		
		// indice começa do 0
		System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
		
		// usando elementos da collection que possui a função nativa de menor nota
		System.out.println("exiba a menor nota: "+Collections.min(notas));
		
		System.out.println("exiba a maior nota: "+Collections.max(notas));
		
		Iterator<Double> iterator =notas.iterator();
		
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next =iterator.next();
			soma+= next;
			
			
		}
		System.out.println("Exiba a soma dos valores: "+soma);
		
		System.out.println("Exiba a media das notas: "+(soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		
		System.out.println(notas);
		
		System.out.println("Removas as notas menores que 7: ");
		Iterator<Double>iterator1 = notas.iterator();
		
		while(iterator1.hasNext()) {
			Double next =iterator1.next();
			
			if(next<7) {
				iterator1.remove();
			}
			
		}
		System.out.println(notas);
		
		
		System.out.println("Apague toda a lista");
		notas.clear();
		
		
		System.out.println("Confira se a lista está vazia: "+notas.isEmpty());
		
		
		
		
	}

}