package notaEscolar;

public class VerificaNota {

	public static void main(String[] args) {
		int nota = 5;
		/*
		if(nota>=7) {
			System.out.println("Aprovado");
		}
		else if(nota>=5 && nota <7) {
			System.out.println("Recuperacao");
		}
		else {
			System.out.println("Reprovado");
		} */
		
		
		//condicional ternária
		String resultado = nota>=7 ? "Aprovado":nota >=5 && nota <7? "recuperacao": "Reprovado";
		
		System.out.println(resultado);
		
	}

}
