import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrganizarElementosList {

	public static void main(String[] args) {
		List<Gato> gatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "Preto"));
			add(new Gato("Simba", 6, "Tigrado"));
			add(new Gato("Jon", 12, "amarelado"));
		}};
		
		
		
		System.out.println("Ordem de insercao");
		System.out.println(gatos);
		
		System.out.println("Ordem aleatoria");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		
		System.out.println("Ordem natural");
		Collections.sort(gatos);
		System.out.println(gatos);
		
		System.out.println("Ordem idade");
		//Collections.sort(gatos, new ComparatorIdade());
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("Ordem Cor");
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		
		System.out.println("Ordem Nome/Cor/Idade");
		Collections.sort(gatos, new ComparatorNomeCorIdade());
		System.out.println(gatos);

	}

}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	//construtor
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gatos) {
		
		return this.getNome().compareToIgnoreCase(gatos.getNome());
	}
	
	
	
}
class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase( g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome!=0) {
			return nome;
		}
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		
		if(cor !=0) {
			return cor;
		}
		
		return Integer.compare( g1.getIdade(),g2.getIdade());
		
	}
	
}
