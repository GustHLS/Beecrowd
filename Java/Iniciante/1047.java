import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int minInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int minFinal = input.nextInt();
        
        int min = 0;
        int hora = 0;

        hora = horaFinal - horaInicial;
        min = minFinal - minInicial;
        
        if(hora <= 0 && min <= 0){
            hora += 24;
        }

        if(min < 0){
            min += 60;
            hora--;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora, min);
    
    }
}
