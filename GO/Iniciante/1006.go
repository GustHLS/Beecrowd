package main

import (
	"fmt"
)

func main() {

  var a, b, c float64

  fmt.Scan(&a)
  fmt.Scan(&b)
  fmt.Scan(&c)

  peso1 := 2.0
  peso2 := 3.0
  peso3 := 5.0
  soma_pesos := peso1 + peso2 + peso3

  media := ((a * peso1) + (b * peso2) + (c * peso3)) / soma_pesos

  fmt.Printf("MEDIA = %.1f\n", media)
  
}
