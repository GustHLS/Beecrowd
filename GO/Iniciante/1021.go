package main

import (
    "fmt"
    "math"
)

func main() {

    var valor float64
    fmt.Scan(&valor)
    
    reais, centavos := math.Modf(valor)
    reaisInt := int(reais)
    centavosInt := int(math.Round(centavos * 100))

    resto := reaisInt
    
    fmt.Printf("NOTAS:\n")
    fmt.Printf("%d nota(s) de R$ 100.00\n", int(resto) / 100)
    resto = int(reaisInt) % 100.0
    
    fmt.Printf("%d nota(s) de R$ 50.00\n", int(resto) / 50)
    resto %= 50.0
    
    fmt.Printf("%d nota(s) de R$ 20.00\n", int(resto) / 20)
    resto %= 20.0
    
    fmt.Printf("%d nota(s) de R$ 10.00\n", int(resto) / 10)
    resto %= 10.0
    
    fmt.Printf("%d nota(s) de R$ 5.00\n", int(resto) / 5)
    resto %= 5.0
    
    fmt.Printf("%d nota(s) de R$ 2.00\n", int(resto) / 2)
    resto %= 2.0
    
    fmt.Printf("MOEDAS:\n")
    
    fmt.Printf("%d moeda(s) de R$ 1.00\n", int(resto) / 1)
    resto = centavosInt
    
    fmt.Printf("%d moeda(s) de R$ 0.50\n", int(resto) / 50)
    resto %= 50.0
    
    fmt.Printf("%d moeda(s) de R$ 0.25\n", int(resto) / 25)
    resto %= 25.0
    
    fmt.Printf("%d moeda(s) de R$ 0.10\n", int(resto) / 10)
    resto %= 10.0
    
    fmt.Printf("%d moeda(s) de R$ 0.05\n", int(resto) / 5)
    resto %= 5.0
    
    fmt.Printf("%d moeda(s) de R$ 0.01\n", resto)
  
}
