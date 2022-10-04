import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagensFavoritas {

	public static void main(String[] args) {
		Set<linguagemFavorita>linguagens = new HashSet<>() {{
			add(new linguagemFavorita("Java",1991,"Eclipse"));
			add(new linguagemFavorita("Python",1989,"PyCharm"));
			add(new linguagemFavorita("PHP",1994, "Php Storm"));
		}};
		
		// Ordem inserção
		System.out.println("Ordem insercao \n");
		Set<linguagemFavorita>linguagensInsercao = new LinkedHashSet<>(){{
			add(new linguagemFavorita("Java",1991,"Eclipse"));
			add(new linguagemFavorita("Python",1989,"PyCharm"));
			add(new linguagemFavorita("PHP",1994, "Php Storm"));
		}};
		
		for (linguagemFavorita linguagemFavorita : linguagensInsercao) {
			System.out.println(linguagemFavorita.getNome()+ " - "+ linguagemFavorita.getAnoDeCriacao()+ " - "+ linguagemFavorita.getIde());
		}
		
		// Ordem natural
		System.out.println("Ordem natural \n");
		Set<linguagemFavorita>linguagemNatural = new TreeSet<linguagemFavorita>(linguagens);
		
		for (linguagemFavorita linguagemFavorita : linguagemNatural) {
			System.out.println(linguagemFavorita.getNome()+ " - "+ linguagemFavorita.getAnoDeCriacao()+ " - "+ linguagemFavorita.getIde());
		
		}
		
		//ordem IDE
		System.out.println("Ordem IDE \n");
		Set<linguagemFavorita>linguagemIde = new TreeSet<>(new ComparatorIDE());
		linguagemIde.addAll(linguagens);
		
		for (linguagemFavorita linguagemFavorita : linguagemIde) {
			System.out.println(linguagemFavorita.getNome()+ " - "+ linguagemFavorita.getAnoDeCriacao()+ " - "+ linguagemFavorita.getIde());
		}
		
		System.out.println("Ordem AnoNome \n");
		Set<linguagemFavorita>linguagemAnoNome = new TreeSet<>(new ComparatorAnoNome());
		linguagemIde.addAll(linguagens);
		
		for (linguagemFavorita linguagemFavorita : linguagemIde) {
			System.out.println(linguagemFavorita.getNome()+ " - "+ linguagemFavorita.getAnoDeCriacao()+ " - "+ linguagemFavorita.getIde());
		}
		
		System.out.println("Ordem NomeAnoIDE \n");
		Set<linguagemFavorita>linguagemNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
		linguagemIde.addAll(linguagens);
		
		for (linguagemFavorita linguagemFavorita : linguagemIde) {
			System.out.println(linguagemFavorita.getNome()+ " - "+ linguagemFavorita.getAnoDeCriacao()+ " - "+ linguagemFavorita.getIde());
		}
		
	}

}



class linguagemFavorita implements Comparable<linguagemFavorita>{
	private String nome;
	private Integer anoDeCriacao;
	private String Ide;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public void setAnoDeCriacao(Integer anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	public String getIde() {
		return Ide;
	}
	public void setIde(String ide) {
		Ide = ide;
	}
	public linguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		Ide = ide;
	}
	@Override
	public int compareTo(linguagemFavorita linguagem) {
		int IDE = this.getIde().compareTo(linguagem.getIde());
		return IDE;
	}
	
	
	
}
class ComparatorIDE implements Comparator<linguagemFavorita>{

	@Override
	public int compare(linguagemFavorita s1, linguagemFavorita s2) {
		int Ide = s1.getIde().compareTo(s2.getIde());
		return Ide;
	}
	
}
class ComparatorAnoNome implements Comparator<linguagemFavorita>{

	@Override
	public int compare(linguagemFavorita o1, linguagemFavorita o2) {
		int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
		if(ano !=0) return ano;
		int nome= o1.getNome().compareTo(o2.getNome());
		if(nome!=0) return nome;
		return 0;
		
		
		
		
	}
	
	
}
class ComparatorNomeAnoIde implements Comparator<linguagemFavorita>{

	@Override
	public int compare(linguagemFavorita o1, linguagemFavorita o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if(nome!=0)return nome;
		int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
		if(ano!=0)return ano;
		int Ide = o1.getIde().compareTo(o2.getIde());
		if(Ide!=0)return Ide;
		
		return 0;
		
		
	}
	
}
