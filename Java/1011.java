import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int raio = scanner.nextInt();
      double pi = 3.14159;
      double volume = (4.0/3.0) * pi * Math.pow(raio, 3);

      String resultado = String.format("VOLUME = %.3f", volume);
      System.out.println(resultado);
    }
}

