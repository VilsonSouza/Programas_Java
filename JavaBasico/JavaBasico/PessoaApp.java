
public class PessoaApp {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(2, "Cleber");
		Pessoa pessoa2 = new Pessoa(3,"Cleiton");
		
		System.out.println("O nome do objeto pessoa 1 eh "+pessoa1.getNome());
		
		pessoa1.setNome("Celso");
		
		System.out.println("O nome do objeto pessoa 1 eh "+pessoa1.getNome());
		
		
	}

}
