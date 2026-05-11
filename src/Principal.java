import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();

        System.out.print("Digite o CEP para buscar o endereço: ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCEP.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println("Erro ao buscar o endereço: " + e.getMessage());
        }
    }
}