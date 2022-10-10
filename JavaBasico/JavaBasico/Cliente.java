
public class Cliente {
	private String nome;
	private String endereco;
	
	// construtor
	public Cliente(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	//getters
	
	public String getNome(){
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	
	//setters
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setEndereco(String endereco) {
		this.endereco= endereco;
	}
	
	
}
