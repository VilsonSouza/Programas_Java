
public class ClientePj extends Cliente{

	@Override
	public String toString() {
		return "ClientePj [cnpj=" + cnpj + "]";
	}
	private String cnpj;
	
	public ClientePj(String nome, String endereco, String cnpj) {
		super(nome,endereco);// pegando atributos do pai
		this.cnpj=cnpj;
		
	}
	
	//getter
	public String getCnpj() {
		return cnpj;
	}
	//setter
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	
	}
	
}
