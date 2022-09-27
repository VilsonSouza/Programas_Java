
public class Vendedor extends Funcionario{
	//atributos
	private Double comissao;
	private int numeroVendas;
	
	@Override
	public double calcularSalario() {
		//pegando a constante na supervariavel funcionario
		//cálculo feito com a comissão e o numero de vendas
		return super.getSALARIO_MINIMO()+(this.comissao* this.numeroVendas);
	}
	//construtores
	public Vendedor(String nome, String cpf, Double comissao, int numeroVendas) {
		super(nome, cpf);
		this.comissao = comissao;
		this.numeroVendas = numeroVendas;
	}
	
	
	
	//getters and setter
		public Double getComissao() {
			return comissao;
		}
	
		public void setComissao(Double comissao) {
			this.comissao = comissao;
		}
		public int getNumeroVendas() {
			return numeroVendas;
		}
		public void setNumeroVendas(int numeroVendas) {
			this.numeroVendas = numeroVendas;
		}
		
	
	
	
	
	
	
}
