using System; 

class URI {

    static void Main(string[] args) { 

        int consumo = Convert.ToInt32(Console.ReadLine());
        double km = Convert.ToDouble(Console.ReadLine());
        
        double kml = consumo / km;
        
        Console.WriteLine($"{kml:F3} km/l");

    }

}
