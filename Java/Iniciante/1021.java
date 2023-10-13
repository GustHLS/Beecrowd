import java.io.IOException;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
  
    double valor = scanner.nextDouble();

    System.out.println("NOTAS:");
    System.out.println(String.format("%d nota(s) de R$ 100.00", (int)valor / 100));
    valor %= 100.00;

    System.out.println(String.format("%d nota(s) de R$ 50.00", (int)valor / 50));
    valor %= 50.00;

    System.out.println(String.format("%d nota(s) de R$ 20.00", (int)valor / 20));
    valor %= 20.00;

    System.out.println(String.format("%d nota(s) de R$ 10.00", (int)valor / 10));
    valor %= 10.00;

    System.out.println(String.format("%d nota(s) de R$ 5.00", (int)valor / 5));
    valor %= 5.00;

    System.out.println(String.format("%d nota(s) de R$ 2.00", (int)valor / 2));
    valor %= 2.00;

    valor *= 100.0;
    System.out.println("MOEDAS:");

    System.out.println(String.format("%d moeda(s) de R$ 1.00", (int)valor / 100));
    valor %= 100.00;

    System.out.println(String.format("%d moeda(s) de R$ 0.50", (int)valor / 50));
    valor %= 50.00;

    System.out.println(String.format("%d moeda(s) de R$ 0.25", (int)valor / 25));
    valor %= 25.00;

    System.out.println(String.format("%d moeda(s) de R$ 0.10", (int)valor / 10));
    valor %= 10.00;

    System.out.println(String.format("%d moeda(s) de R$ 0.05", (int)valor / 5));
    valor %= 5.00;

    System.out.println(String.format("%d moeda(s) de R$ 0.01", (int)valor / 1));
    
  }
}
