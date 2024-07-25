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
  
      double a = valores[2]; // Maior lado
      double b = valores[1]; // Segundo maior
      double c = valores[0]; // Menor lado
  
      if (a >= b + c) {
        System.out.println("NAO FORMA TRIANGULO");
      } 
      else {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
          System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
          System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
          System.out.println("TRIANGULO ACUTANGULO");
        }
  
        if (a == b && b == c) {
          System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a == c) {
          System.out.println("TRIANGULO ISOSCELES");
      }
    }
  }
}
