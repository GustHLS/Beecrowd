import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double x1 = 0;
    double x2 = 0;

    double delta = Math.pow(b, 2) - (4 * a * c);

    if(delta > 0 && a > 0 && b > 0){
      x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
      x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);

      System.out.printf("R1 = %.5f\n", x1);
      System.out.printf("R2 = %.5f\n", x2);
    }
    else{
      System.out.println("Impossivel calcular");
    }
  }
}
