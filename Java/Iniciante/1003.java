import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int soma = a + b;

      String resultado = String.format("SOMA = %s", soma);
      System.out.println(resultado);
    }
}

