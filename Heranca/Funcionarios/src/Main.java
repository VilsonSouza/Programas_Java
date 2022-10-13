public class Main {
    public static void main(String[] args) {

       Funcionario funcionario = new Funcionario();
     //upcasts
       Funcionario gerente = new Gerente();
       Funcionario vendedor =  new Vendedor();
       Funcionario faxineiro = new faxineiro();

       //Downcast
        Vendedor vendedor1 = (Vendedor) new Funcionario();


    }
}