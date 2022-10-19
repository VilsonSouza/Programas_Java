import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do Arquivo: ");
        imprimirArquivoNoConsole(nomeDoArquivo);

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo){

        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();
        }catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());

        } catch(IOException e){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro nao esperado, por favor fale com o suporte");
            e.printStackTrace();
        }


    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}// fim da classe

class ImpossivelAberturaDeArquivoException extends Exception{
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " +nomeDoArquivo+ " Nao foi encontrado no diretorio " +diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}

