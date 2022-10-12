
public class ClienteApp {

	public static void main(String[] args) {
		ClientePf clientepf1 = new ClientePf("Cleiton", "Casa dele", "65342122");
		ClientePj clientepj1 = new ClientePj("Cleber", "Casa dele", "632122333");
		
		System.out.println("Cliente Pf Dados: "+clientepf1.getNome()+" - "+clientepf1.getEndereco()+" - "+clientepf1.getCpf());
		System.out.println("Cliente Pj Dados: "+clientepj1.getNome()+" - "+clientepj1.getEndereco()+" - "+clientepj1.getCnpj());
		
		System.out.println(clientepf1.toString());
		System.out.println(clientepj1.toString());
		
		
		
	}

}
