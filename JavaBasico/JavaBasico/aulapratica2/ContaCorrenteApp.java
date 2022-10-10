package aulapratica2;

public class ContaCorrenteApp {

	public static void main(String[] args) {
		ContaCorrente contacomum = new ContaCorrente(124,542);
		ContaCorrente contaespecial = new ContaCorrente(125,542,1000.00f);
		
		System.out.println("Dados conta 1: ");
		System.out.println("Agencia: "+contacomum.getAgencia()+" Numero da conta: "+contacomum.getNumero());
		System.out.println("Dados Conta2: ");
		System.out.println("Agencia:"+contaespecial.getAgencia()+" Numero da conta:  "+contaespecial.getNumero()+" Limite Cheque Especial "+contaespecial.getLimite());
	}

}
