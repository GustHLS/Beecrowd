package main

import (
	"fmt"
)

func main() {

  var valor int
  fmt.Scan(&valor)
  fmt.Printf("%d\n", valor)
  
  fmt.Printf("%d nota(s) de R$ 100,00\n", valor / 100)
  valor %= 100
  
  fmt.Printf("%d nota(s) de R$ 50,00\n", valor / 50)
  valor %= 50

  fmt.Printf("%d nota(s) de R$ 20,00\n", valor / 20)
  valor %= 20
  
  fmt.Printf("%d nota(s) de R$ 10,00\n", valor / 10)
  valor %= 10
  
  fmt.Printf("%d nota(s) de R$ 5,00\n", valor / 5)
  valor %= 5
  
  fmt.Printf("%d nota(s) de R$ 2,00\n", valor / 2)
  valor %= 2
  
  fmt.Printf("%d nota(s) de R$ 1,00\n", valor)
  
}
