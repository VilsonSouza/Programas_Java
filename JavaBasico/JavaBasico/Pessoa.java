
public class Pessoa {
	
	private int codigo;
	private String nome;
	// constructor na mão
	public Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome=nome;
	}
	// sem os getters and setters, não podemos imprimir ou acessar os valores
	
	//getter and setter na mão
	
	public String getNome() {
		return nome;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
