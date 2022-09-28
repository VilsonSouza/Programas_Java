
public class ExemploForArrays {

	public static void main(String[] args) {
		
		String alunos[]= {"Felipe","Jonas","Julia", "Marcos"};
		//for comum
		for (int x=0; x<alunos.length;x++) {
			System.out.println("O aluno no indice x = " + x +  " e " + alunos[x]);
		}
		//for each
		
		for(String aluno: alunos) {
			System.out.println("Nome do aluno eh: "+aluno);
		}
	}

}
