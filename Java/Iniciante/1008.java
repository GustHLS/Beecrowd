import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int n_func = scanner.nextInt();
      int n_horas = scanner.nextInt();
      float sal_hora = scanner.nextFloat();

      float salario = n_horas * sal_hora;

      String resultado = String.format("NUMBER = %s\nSALARY = U$ %.2f", n_func, salario);
      System.out.println(resultado);
    }
}

