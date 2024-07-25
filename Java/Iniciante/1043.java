import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();
    double[] valores = {n1, n2, n3};

    Arrays.sort(valores);

    if(valores[valores.length-1] >= valores[0] + valores[1]){
      double base = n1;
      double base2 = n2;
      double altura = n3;

      double area = ((base + base2) * altura) / 2;
      System.out.printf("Area = %.1f\n", area);
    }
    else{
      double perimetro = n1 + n2 + n3;
      System.out.printf("Perimetro = %.1f\n", perimetro);
    }
  }
}
