
public class Consultor extends Funcionario{
	//atributos
	private Double valorHora;
	private Long horasTrabalhadas;
	
	
	// construtor
	public Consultor(String nome, String cpf, Double valorHora, Long horasTrabalhadas) {
		super(nome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	//getters and setters
	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Long getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Long horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	

	//pegando o metodo de funcionario
	public double calcularSalario() {
		return this.valorHora* this.horasTrabalhadas;
		
	}

	
	
}
