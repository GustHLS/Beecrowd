import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int maiorAB = (a + b + Math.abs(a-b)) / 2;
      int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        
      String resultado = String.format("%s eh o maior", maiorABC);
      System.out.println(resultado);
    }
}

