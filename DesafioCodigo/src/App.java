// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class App {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    
    System.out.println("Insira o valor do leitor: ");
    int t = leitor.nextInt(); 
   
// TODO: Implemente uma condição onde possamos preencher o vetor de N.
    
// Lembre-se a sequência de valores é de 0 até T-1:
        int [] N = new int[1000];
        
        for(int i=0;i<1000;i++) {
        	for(int j=0;j<t;j++) {
        		if(t>=2 && t<=50){
        			N[j]=j;
                   System.out.println("N[" +i+ "] = "+N[j]);
                   i++;
        		}
        	}
        }
       
}

}
