import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      String nome = scanner.next();
      double sal_fixo = scanner.nextFloat();
      double valor_vendas = scanner.nextFloat();
      double total = sal_fixo + (valor_vendas * 0.15);

      String resultado = String.format("TOTAL = R$ %.2f", total);
      System.out.println(resultado);
      
    }
}

