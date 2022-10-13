public class Main {
    public static void main(String[] args) {

       Clientes cliente1 = new Clientes("Cleiton","Rua tal","323123132",129934312);

        System.out.println("Nome do cliente; "+cliente1.getNome()+
                " Endereco: "+cliente1.getEndereco()+" Cpf: "+cliente1.getCpf()+" Telefone: "+cliente1.getTelefone());

    }
}