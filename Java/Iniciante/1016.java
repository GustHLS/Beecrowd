import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int y = scanner.nextInt();
      int kmh = y * 2;

      String resultado = String.format("%s minutos", kmh);
      System.out.println(resultado);
    }
}

