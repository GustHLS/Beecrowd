import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int tempo = scanner.nextInt();
      int velocidade = scanner.nextInt();
      double qtd_litros = (tempo * velocidade) / 12.0;

      String resultado = String.format("%.3f", qtd_litros);
      System.out.println(resultado);
    }
}

