using System; 

class URI {

    static void Main(string[] args) { 

        int valor = Convert.ToInt32(Console.ReadLine());

        int ano = valor / 365;
        valor %= 365;
        
        int meses = valor / 30;
        valor %= 30;
        
        int dias = valor % 30;
        
        Console.WriteLine($"{ano} ano(s)");
        Console.WriteLine($"{meses} mes(es)");
        Console.WriteLine($"{dias} dia(s)");

    }

}
