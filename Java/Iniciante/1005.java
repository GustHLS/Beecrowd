import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      double a = (scanner.nextDouble()) * 3.5;
      double b = (scanner.nextDouble()) * 7.5;
      double media = (a + b) / 11;

      String resultado = String.format("MEDIA = %.5f", media);
      System.out.println(resultado);
    }
}

