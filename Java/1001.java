import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      int soma = n1 + n2;

      String resultado = String.format("X = %s", soma);
      System.out.println(resultado);
    }
}

