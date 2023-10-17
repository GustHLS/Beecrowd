using System; 

class URI {

    static void Main(string[] args) { 

        string nome = Console.ReadLine();
        double salario = Convert.ToDouble(Console.ReadLine());
        double vendas = Convert.ToDouble(Console.ReadLine());
        vendas *= 0.15;
        
        salario += vendas;
        
        Console.WriteLine($"TOTAL = R$ {salario:F2}");

    }

}
