using System; 

class URI {

    static void Main(string[] args) { 

        double a = Convert.ToDouble(Console.ReadLine());
        double b = Convert.ToDouble(Console.ReadLine());
        double c = Convert.ToDouble(Console.ReadLine());    
        
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        int soma_pesos = peso1 + peso2 + peso3;
        
        double media = ((a * peso1) + (b * peso2) + (c * peso3)) / soma_pesos;
        
        Console.WriteLine($"MEDIA = {media:F1}");

    }

}
