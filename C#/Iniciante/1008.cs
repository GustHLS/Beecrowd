using System; 

class URI {

    static void Main(string[] args) { 

        int n = Convert.ToInt32(Console.ReadLine());
        int n_horas = Convert.ToInt32(Console.ReadLine());
        double valor_hora = Convert.ToDouble(Console.ReadLine());
        
        double salario = n_horas * valor_hora;
        
        Console.WriteLine($"NUMBER = {n}");
        Console.WriteLine($"SALARY = U$ {salario:F2}");

    }

}
