import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String tipo1 = input.next();    
        String tipo2 = input.next();    
        String tipo3 = input.next();   
        String animal;

            
        if(tipo1.equals("vertebrado")){
            if(tipo2.equals("ave")){
                if(tipo3.equals("carnivoro")){
                    animal = "aguia";
                }
                else{
                    animal = "pomba";
                }
            }
            else{
                if(tipo3.equals("onivoro")){
                    animal = "homem";
                }
                else{
                    animal = "vaca";
                }
            }
        }

        else{
            if(tipo2.equals("inseto")){
                if(tipo3.equals("hematofago")){
                    animal = "pulga";
                }
                else{
                    animal = "lagarta";
                }
            }
            else{
                if(tipo3.equals("hematofago")){
                    animal = "sanguessuga";
                }
                else{
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);
    }
}
