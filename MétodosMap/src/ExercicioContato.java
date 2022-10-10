import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioContato {

	/*Dadas as seguintes informações  de id e contato, crie um dicionário e
	ordene este dicionário exibindo (Nome id - Nome contato);
	id = 1 - Contato = nome: Simba, numero: 2222;
	id = 4 - Contato = nome: Cami, numero: 5555;
	id = 3 - Contato = nome: Jon, numero: 1111;
	*/
	public static void main(String[] args) {
		System.out.println("Ordem aleatoria");
		Map<Integer,Contato>meusContatos= new HashMap<>() {{
			put(1, new Contato("Simba",2222));
			put(4,new Contato("Cami",5555));
			put(3, new Contato("Jon",1111));
			
		}};
		
		for (Map.Entry<Integer, Contato> entry: meusContatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
		
		System.out.println("Ordem insercao");
		
		Map<Integer, Contato>meusContatosInsert = new LinkedHashMap<>() {{
			put(1, new Contato("Simba",2222));
			put(4,new Contato("Cami",5555));
			put(3, new Contato("Jon",1111));
			
		}};
		
		for(Map.Entry<Integer, Contato>entry2: meusContatosInsert.entrySet()) {
			System.out.println(entry2.getKey()+ " - "+ entry2.getValue().getNome());
		}
		
		System.out.println("Ordem numero");
		Set<Map.Entry<Integer, Contato>>meusContatosTree = new TreeSet<>(new ComparatorOrdemNumerica());
		 meusContatosTree.addAll(meusContatos.entrySet());
		 
		 for(Map.Entry<Integer, Contato> entry3:meusContatosTree) {
			 System.out.println(entry3.getKey() + " - " + entry3.getValue().getNumero() +
	                    ": " +entry3.getValue().getNome());
		 }
		 
		
		 System.out.println("Ordem nome contato");
		 Set<Map.Entry<Integer, Contato>>meusContatosOrdemNome = new TreeSet<>(new ComparatorOrdemNomeContato());
		 meusContatosOrdemNome.addAll(meusContatos.entrySet());
		   for (Map.Entry<Integer, Contato> entry: meusContatosOrdemNome) {
	            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
	        }
		 
	}

}
class Contato{
	
	private String nome;
	private Integer numero;
	public Contato(String nome, Integer numero) {
		super();
		
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	

}
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>>{

	@Override
	public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
		int contato = o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
		int nome = o1.getValue().getNome().compareTo(o2.getValue().getNome());
		if(nome==1)return nome;
		if(nome==0)return contato;
		return 0;
		
	}
	
}
