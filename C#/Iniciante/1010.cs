using System; 

class URI {

    static void Main(string[] args) { 

        string[] linha1 = Console.ReadLine().Split(' ');
        int cod_p1 = Convert.ToInt32(linha1[0]);
        int n_p1 = Convert.ToInt32(linha1[1]);
        double valor_p1 = Convert.ToDouble(linha1[2]);
        
        string[] linha2 = Console.ReadLine().Split(' ');
        
        int cod_p2 = Convert.ToInt32(linha2[0]);
        int n_p2 = Convert.ToInt32(linha2[1]);
        double valor_p2 = Convert.ToDouble(linha2[2]);
        
        double valor_final = (n_p1 * valor_p1) + (n_p2 * valor_p2);
        
        Console.WriteLine($"VALOR A PAGAR: R$ {valor_final:F2}");

    }

}
