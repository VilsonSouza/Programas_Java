import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};

        for(int i=0; i<denominador.length;i++){
            try{
                if(numerador[i]%2 !=0)throw new DivisaoNaoExataException("Divisao nao exata",numerador[i],denominador[i]);
                if(denominador[i]==0)throw new DivisaoImpossivelException("Impossivel dividir um numero por zero",numerador[i],denominador[i]);
                if(numerador.length<denominador.length)throw new TamanhoVetorMenorException("O tamanho de um dos vetores e maior que do outro",numerador[i],denominador[i]);
                if(numerador.length>denominador.length)throw new TamanhoVetorMenorException("O tamanho de um dos vetores e maior que do outro",numerador[i],denominador[i]);
                int resultado = numerador[i]/denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
               e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(DivisaoImpossivelException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(TamanhoVetorMenorException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }


        }
    }
}
