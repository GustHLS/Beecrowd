using System; 

class URI {

    static void Main(string[] args) { 

        double valor = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("NOTAS:");
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 100))} nota(s) de R$ 100.00");
        valor %= 100;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 50))} nota(s) de R$ 50.00");
        valor %= 50;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 20))} nota(s) de R$ 20.00");
        valor %= 20;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 10))} nota(s) de R$ 10.00");
        valor %= 10;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 5))} nota(s) de R$ 5.00");
        valor %= 5;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 2))} nota(s) de R$ 2.00");
        valor %= 2;
        
        Console.WriteLine("MOEDAS:");
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 1))} moeda(s) de R$ 1.00");
        valor %= 1;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 0.5))} moeda(s) de R$ 0.50");
        valor %= 0.5;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 0.25))} moeda(s) de R$ 0.25");
        valor %= 0.25;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 0.1))} moeda(s) de R$ 0.10");
        valor %= 0.1;
        
        Console.WriteLine($"{Convert.ToInt32(Math.Floor(valor / 0.05))} moeda(s) de R$ 0.05");
        valor %= 0.05;
        
        Console.WriteLine($"{Convert.ToInt32(valor / 0.01)} moeda(s) de R$ 0.01");

    }

}
