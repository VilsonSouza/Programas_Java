//nome da classe
public abstract class Funcionario {
	
	// atributos, devem ser encapsulados
	private String nome;
	private String cpf;
	
	// Escrever constantes em letra maiuscula
	protected final Double SALARIO_MINIMO=1000.0;
	
	// construtuor criado
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// boa prática criar um construtor vazio
	public Funcionario() {
			
	}
		// criação de método abstrato
	public abstract double calcularSalario();
	
	
	
	//getter an setters criados com o atalho ctrl + 3
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}
	
	
	
	
	
	

}
