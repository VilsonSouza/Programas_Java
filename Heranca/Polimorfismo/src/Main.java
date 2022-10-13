public class Main {
    public static void main(String[] args) {
       ClasseMae[] classes  = new ClasseMae[]{new ClasseFilha1(),new CLasseFilha2(), new ClasseMae()};

       for(ClasseMae classe:classes){
           classe.metodo1();
       }
        System.out.println("");
       for(ClasseMae classe:classes){
           classe.metodo2();
       }
        System.out.println("");

       CLasseFilha2 cLasseFilha2 = new CLasseFilha2();
       cLasseFilha2.metodo2();

    }
}