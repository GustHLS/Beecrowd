import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    while (input.hasNext()) {
      int qtd_moedas = input.nextInt();
      int[] moedas = new int[qtd_moedas];
      
      int somador = 0;
      boolean perdeu = false;

      for (int i = 0; i < qtd_moedas; i++) {
        moedas[i] = input.nextInt();
      }

      int saltos = input.nextInt();
      for (int i = qtd_moedas - 1; i >= 0; i -= saltos) {
        somador += moedas[i];
      }

      if (somador < 2) {
        perdeu = true;
      } else {
        for (int i = 2; i <= Math.sqrt(somador); i++) {
          if (somador % i == 0) {
            perdeu = true;
            break;
          }
        }
      }

      if(perdeu) {
        System.out.println("Bad boy! I’ll hit you.");
      } else {
        System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
      }
    }
  }
}

