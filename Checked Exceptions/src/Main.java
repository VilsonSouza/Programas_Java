

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class Main {
    public static void main(String[] args) {
        String nomeDoArquivo = "tete.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo digitado");
            e.printStackTrace();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado ! Entre em contato com o suporte");
            e.printStackTrace();
        }



    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}