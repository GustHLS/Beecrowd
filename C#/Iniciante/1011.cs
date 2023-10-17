using System; 

class URI {

    static void Main(string[] args) { 

        double raio = Convert.ToDouble(Console.ReadLine());
        double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * (raio * raio * raio);
        
        Console.WriteLine($"VOLUME = {volume:F3}");

    }

}
