public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio do programa no metodo main: ");
        a();
    }
    static void a(){
        System.out.println("entrou no metodo a");
        b();
        System.out.println("Finalizou o metodo a");
    }
    static void b(){
        System.out.println("Entrou no metodo b");
        for(int i =0; i<=4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b");
    }
    static void c(){
        System.out.println("entrou no metodo c");
        System.out.println("finalizou o metodo c");
    }
}