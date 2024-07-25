import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    int t = input.nextInt();
    int j = 0;
    int[] vetor = new int[1000];

    for(int i = 0; i < vetor.length; i++){
      if(j == t){
        j = 0;
      }
      System.out.printf("N[%d] = %d\n", i, j);
      j++;
    }
  }
}
