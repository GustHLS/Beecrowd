import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int x = scanner.nextInt();
      double y = scanner.nextDouble();
      double total = x / y;

      String resultado = String.format("%.3f km/l", total);
      System.out.println(resultado); 
    }
}

