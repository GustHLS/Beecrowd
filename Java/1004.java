import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      int PROD = n1 * n2;

      String resultado = String.format("PROD = %s", PROD);
      System.out.println(resultado);
    }
}

