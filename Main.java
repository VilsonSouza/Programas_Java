package Programas;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int A,B,PROD;

        A= leitor.nextInt();
        B= leitor.nextInt();

        PROD=A*B;   // implemente o código que representa a multiplicação

        System.out.println("Prod="+PROD);

        leitor.close();

    }

}