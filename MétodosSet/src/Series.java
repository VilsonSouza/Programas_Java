import java.util.Comparator;
import java.util.Objects;

public class Series implements Comparable<Series>{

		private String nome;
		private String genero;
		private Integer tempoEpisodio;
		public Series(String nome, String genero, Integer tempoEpisodio) {
			super();
			this.nome = nome;
			this.genero = genero;
			this.tempoEpisodio = tempoEpisodio;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public Integer getTempoEpisodio() {
			return tempoEpisodio;
		}
		public void setTempoEpisodio(Integer tempoEpisodio) {
			this.tempoEpisodio = tempoEpisodio;
		}
		@Override
		public String toString() {
			return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(genero, nome, tempoEpisodio);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Series other = (Series) obj;
			return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
					&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
		}
		@Override
		public int compareTo(Series series) {
			int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),series.getTempoEpisodio());
			int genero = this.getGenero().compareTo(series.getGenero());
			
			if(tempoEpisodio !=0) {
				return tempoEpisodio;
			}else {
				return genero;
			}
			
		}
		
}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series>{
			@Override
		public int compare(Series s1, Series s2) {
				int nome = s1.getNome().compareTo(s2.getNome());
				if(nome !=0) return nome;
				
				int genero = s1.getGenero().compareTo(s2.getGenero());
				if(genero !=0) return genero;
				
				
				return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
				
				
		}
			
}
class ComparatorGenero implements Comparator<Series>{

	@Override
	public int compare(Series s1, Series s2) {
		return s1.getGenero().compareTo(s2.getGenero());
	}
	
}
		
		

	

