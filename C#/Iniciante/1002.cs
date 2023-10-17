using System; 

class URI {

    static void Main(string[] args) { 

        double pi = 3.14159;
        double raio = Convert.ToDouble(Console.ReadLine());
        double area = (raio * raio) * pi;

        Console.WriteLine($"A={area:F4}");

    }

}
