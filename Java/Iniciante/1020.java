import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int dia = scanner.nextInt(), mes, ano;

      ano = dia / 365;
      dia %= 365;

      mes = dia / 30;
      dia %= 30;

      System.out.println(String.format("%d ano(s)\n%d mes(es)\n%d dia(s)", ano, mes, dia));

    }
}
