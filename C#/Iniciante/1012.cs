using System; 

class URI {

    static void Main(string[] args) { 

        string[] valores = Console.ReadLine().Split(' ');

        double a = Convert.ToDouble(valores[0]);
        double b = Convert.ToDouble(valores[1]);
        double c = Convert.ToDouble(valores[2]);
        double pi = 3.14159;
        
        double triangulo = (a * c) / 2;
        double circulo = pi * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        
        Console.WriteLine($"TRIANGULO: {triangulo:F3}");
        Console.WriteLine($"CIRCULO: {circulo:F3}");
        Console.WriteLine($"TRAPEZIO: {trapezio:F3}");
        Console.WriteLine($"QUADRADO: {quadrado:F3}");
        Console.WriteLine($"RETANGULO: {retangulo:F3}");

    }

}
