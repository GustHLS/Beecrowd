import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int fatorial = 1;
		
		for(int i = n; i > 0; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		input.close();
 
    }
 
}
