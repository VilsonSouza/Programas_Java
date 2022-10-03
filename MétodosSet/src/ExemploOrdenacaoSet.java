import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*Dadas as seguintes informações sobre minhas séries favoritas,
		 * crie um conjunto e ordene este conjunto exibindo:
		 * 9nome - gener - tempo de episodio*/
		//Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
		//Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
		//Serie 3 = Nome: that's 70s show, genero: comédia, tempoEpisodio: 25
public class ExemploOrdenacaoSet extends Series{
	

	public ExemploOrdenacaoSet(String nome, String genero, Integer tempoEpisodio) {
		super(nome, genero, tempoEpisodio);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args, Set<Series> Series) {
		
		System.out.println("--\tOrdem aletoria \t--");
		Set<Series>minhasSeries = new HashSet<>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Series("Got","Fantasia",60));
			add(new Series("dark","Drama",60));
			add(new Series("that's 70s show","Comédia",25));
		}};
		
		for(Series serie: minhasSeries) {
			System.out.println(serie.getNome()+ " - "+ serie.getGenero()+ " - "+ serie.getTempoEpisodio());
		}
		
		System.out.println("--\tOrdem insercao\t--");
		Set<Series>minhasSeries1 = new LinkedHashSet<>() {{
			add(new Series("Got","Fantasia",60));
			add(new Series("dark","Drama",60));
			add(new Series("that's 70s show","Comedia",25));
		}};
		
		for(Series serie: minhasSeries1) {
			System.out.println(serie.getNome()+ " - "+ serie.getGenero()+ " - "+ serie.getTempoEpisodio());
		}
		
		
		
		System.out.println("--\tOrdem natural\t--");
		Set<Series>minhasSeries2= new TreeSet<>(minhasSeries1);
		for(Series serie: minhasSeries2) {
			System.out.println(serie.getNome()+ " - "+ serie.getGenero()+ " - "+ serie.getTempoEpisodio());
		}
		
		
		System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
		Set<Series>minhasSeries3= new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		for(Series serie: minhasSeries3) {
			System.out.println(serie.getNome()+ " - "+ serie.getGenero()+ " - "+ serie.getTempoEpisodio());
		}
		
	}

}
		
	


