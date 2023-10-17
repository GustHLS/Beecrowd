using System; 

class URI {

    static void Main(string[] args) { 

        int tempo = Convert.ToInt32(Console.ReadLine());

        int hora = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;
        
        Console.WriteLine($"{hora}:{minutos}:{segundos}");

    }

}
