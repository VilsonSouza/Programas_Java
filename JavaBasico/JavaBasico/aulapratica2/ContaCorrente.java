package aulapratica2;

public class ContaCorrente {
	private Integer numero,agencia;
	private float limite;
	
	public ContaCorrente(Integer numero, Integer agencia) {
		super();
		this.numero = numero;
		this.agencia = agencia;
	}
	public ContaCorrente(Integer numero, Integer agencia, float limite) {
		super();
		this.numero=numero;
		this.agencia=agencia;
		this.limite=limite;
		
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	
}
