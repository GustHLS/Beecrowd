import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int d = scanner.nextInt();

      int diferenca = a * b - c * d;

      String resultado = String.format("DIFERENCA = %s", diferenca);
      System.out.println(resultado);
    }
}

