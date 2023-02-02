import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int valor = scanner.nextInt();
      System.out.println(String.format("%s", valor));

      System.out.println(String.format("%s nota(s) de R$ 100,00", valor / 100));
      valor = valor % 100;

      System.out.println(String.format("%s nota(s) de R$ 50,00", valor / 50));
      valor = valor % 50;

      System.out.println(String.format("%s nota(s) de R$ 20,00", valor / 20));
      valor = valor % 20;

      System.out.println(String.format("%s nota(s) de R$ 10,00", valor / 10));
      valor = valor % 10;

      System.out.println(String.format("%s nota(s) de R$ 5,00", valor / 5));
      valor = valor % 5;

      System.out.println(String.format("%s nota(s) de R$ 2,00", valor / 2));
      valor = valor % 2;

      System.out.println(String.format("%s nota(s) de R$ 1,00", valor / 1));
    }
}

