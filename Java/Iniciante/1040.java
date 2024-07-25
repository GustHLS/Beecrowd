import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    float n1 = input.nextFloat();
    float n2 = input.nextFloat();
    float n3 = input.nextFloat();
    float n4 = input.nextFloat();

    float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;

    System.out.printf("Media: %.1f\n", media);

    if(media >= 7){
      System.out.println("Aluno aprovado.");
    }
    else if(media >= 5 && media <= 6.9){
      System.out.println("Aluno em exame.");
      float n5 = input.nextFloat();
        
      System.out.printf("Nota do exame: %.1f\n", n5);

      media = (media + n5) / 2;

      if(media >= 5){
        System.out.println("Aluno aprovado.");
        System.out.printf("Media final: %.1f\n", media);
      }
      else{
        System.out.println("Aluno reprovado.");
      }
      
    }
    else{
      System.out.println("Aluno reprovado.");
    }
  }
}
