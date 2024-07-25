import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();

    int q = a / b;
    int r = a % b;

    if (r < 0) {
      if (b > 0) {
        r += b;
        q -= 1;
      } else {
        r -= b;
        q += 1;
      }
    }

    System.out.printf("%d %d\n", q, r);
  }
}
