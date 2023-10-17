using System; 

class URI {

    static void Main(string[] args) { 

        double a = Convert.ToDouble(Console.ReadLine());
        double b = Convert.ToDouble(Console.ReadLine());

        double peso1 = 3.5;
        double peso2 = 7.5;
        double soma_pesos = peso1 + peso2;

        double media = ((a * peso1) + (b * peso2)) / soma_pesos;

        Console.WriteLine($"MEDIA = {media:F5}");

    }

}
