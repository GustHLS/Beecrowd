using System; 

class URI {

    static void Main(string[] args) { 

        int tempo = Convert.ToInt32(Console.ReadLine());
        int vel = Convert.ToInt32(Console.ReadLine());
        
        double qtd_litros = (vel / 12.0) * tempo;
        
        Console.WriteLine($"{qtd_litros:F3}");

    }

}
