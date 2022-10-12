import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExercicioStremAPI {

	public static void main(String[] args) {
		List<String> numerosAleatorios =
				Arrays.asList("1","0","4","1","2","3","9","9","6","5");
		
		System.out.println("Imprima todos os elementos dessa lista de strings: ");
		// o foreach pede um consumer, que no caso é preciso um método que é o accept
		
		/*numerosAleatorios.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});*/
		
		// usando Lambda
		numerosAleatorios.forEach(t->System.out.println(t));

		
		System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set");
		numerosAleatorios.stream()
			.limit(5)//limit ele pega os valores até o limite inserido
			.collect(Collectors.toSet())// coleta os elementos, e o collectors to set insere num set
			.forEach(System.out::println); // metodo de impressao reduzido
		
		System.out.println("Transforme essa lista de string em lista de inteiros");
		List<Integer>numerosAleatorios1 = numerosAleatorios.stream()
										  .map(Integer::parseInt)
										  .collect(Collectors.toList());
		
		
		numerosAleatorios1.forEach(System.out::println);
		
		System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
		numerosAleatorios.stream()
		.map(Integer::parseInt)
		.filter(i-> i%2 == 0 && i>2).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Mostre a media dos numeros");
		numerosAleatorios.stream()
		.mapToInt(value -> Integer.parseInt(value))
		.average()
		.ifPresent(System.out::println);
		
		System.out.println("Remova os valores impares");
		
		numerosAleatorios1.removeIf(i-> i%2 !=0);
		
		System.out.println(numerosAleatorios1);
		
	}

}
