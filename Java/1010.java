import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int cod_p1 = scanner.nextInt();
      int n_p1 = scanner.nextInt();
      double valor_p1 = scanner.nextDouble();

      int cod_p2 = scanner.nextInt();
      int n_p2 = scanner.nextInt();
      double valor_p2 = scanner.nextDouble();

      double valor_total = (n_p1 * valor_p1) + (n_p2 * valor_p2);
      
      String resultado = String.format("VALOR A PAGAR: R$ %.2f", valor_total);
      System.out.println(resultado);
    }
}
