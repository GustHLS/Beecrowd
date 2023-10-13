import java.io.IOException;
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      int segundos = scanner.nextInt();

      int horas = segundos / 3600;
      segundos = segundos % 3600;
      
      int minutos = segundos / 60;
      segundos = segundos % 60;

      System.out.println(String.format("%s:%s:%s", horas, minutos, segundos));
    }
}
