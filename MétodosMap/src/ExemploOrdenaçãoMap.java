import java.util.Objects;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
public class ExemploOrdenaçãoMap {
	/*dados
	 * Livros favoritos e autores
	 * exibindo (Nome Autor - Nome Livro paginas: )
	 * 
	 * Autor Hawking ,Stephen - Livro = nome: Uma breve istoria do tempo. Paginas: 256
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		
		System.out.println("--\tOrdem Aleatoria\t--");
		Map<String,Livros> meusLivros = new HashMap<>() {{
			put("Hawking , Stephen", new Livros("Uma breve Historia do tempo",256));
			put("Duhig , Chales", new Livros("O poder do habito",408));
			put("Harari , Yuval Noah",new Livros("21 Licoes para o Seculo 21",432));
		
		}};
		for(Map.Entry<String, Livros>livro:meusLivros.entrySet()) {
			System.out.println(livro.getKey()+ " - "+livro.getValue().getNome());
			
		}
		System.out.println("--\tOrdem Insercao\t--");
		Map<String,Livros> meusLivros1 = new LinkedHashMap<>() {{
			put("Hawking , Stephen", new Livros("Uma breve Historia do tempo",256));
			put("Duhig , Chales", new Livros("O poder do habito",408));
			put("Harari , Yuval Noah",new Livros("21 Licoes para o Seculo 21",432));
		
		}};
		for(Map.Entry<String, Livros>livro1:meusLivros1.entrySet()) {
			System.out.println(livro1.getKey()+ " - "+livro1.getValue().getNome());
			
		}
		
		System.out.println("--\tOrdem alfabetica autores\t--");
		Map<String,Livros> meusLivros2 = new TreeMap<>(meusLivros);
		for(Map.Entry<String, Livros>livro2:meusLivros2.entrySet()) {
			System.out.println(livro2.getKey()+ " - "+livro2.getValue().getNome());
			
		}
		
		System.out.println("--\tOrdem alfabetica nomes dos livros \t--");
		Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		
		for(Map.Entry<String, Livros>livro3:meusLivros3) {
			System.out.println(livro3.getKey()+ " - "+livro3.getValue().getNome());
			
		}
		
		System.out.println("--\tOrdem numero Pagina\t--");
		Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorNumeroPaginas());
		meusLivros4.addAll(meusLivros.entrySet());
		
		for(Map.Entry<String, Livros>livro4:meusLivros4) {
			System.out.println(livro4.getKey()+ " - "+livro4.getValue().getNome()+" - "+livro4.getValue().getNumeroPaginas());
			
		}
	}

}
class Livros{
	private String nome;
	private Integer numeroPaginas;
	public Livros(String nome, Integer numeroPaginas) {
		super();
		this.nome = nome;
		this.numeroPaginas = numeroPaginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroPaginas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroPaginas, other.numeroPaginas);
	}
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", numeroPaginas=" + numeroPaginas + "]";
	}
	
	
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{

	@Override
	public int compare(Map.Entry<String, Livros>l1, Map.Entry<String, Livros> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
		
	}
	
}
class ComparatorNumeroPaginas implements Comparator<Map.Entry<String, Livros>>{

	@Override
	public int compare(Entry<String, Livros> o1, Entry<String, Livros> o2) {
		return o1.getValue().getNumeroPaginas().compareTo(o2.getValue().getNumeroPaginas());
	}
	
}