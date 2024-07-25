import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    int testes = input.nextInt();

    for(int i = 0; i < testes; i++){
      int n = input.nextInt();
      boolean primo = true;

      for (int j = 2; j <= Math.sqrt(n); j++) {
        if (n % j == 0) {
          primo = false;
          break;
        }
      }

      if(primo){
        System.out.printf("%d eh primo\n", n);
      } else {
        System.out.printf("%d nao eh primo\n", n);
      }
    }
  }
}
