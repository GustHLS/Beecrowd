import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    int inicio = input.nextInt();
    int fim = input.nextInt();
    int tempo;

    if(inicio < fim){
      tempo = fim - inicio;
    }
    else{
      tempo = 24 - inicio + fim;
    }

    System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);
    
  }
}
