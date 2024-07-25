import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    int codigo = input.nextInt();
    int qtd = input.nextInt();
    double total = 0;

    switch(codigo){
      case 1:
        total = 4.00 * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
        break;
        
      case 2:
        total = 4.50 * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
        break;
        
      case 3:
        total = 5.00 * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
        break;
        
      case 4:
        total = 2.00 * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
        break;
        
      case 5:
        total = 1.50 * qtd;
        System.out.printf("Total: R$ %.2f\n", total);
        break;
    }
  }
}
