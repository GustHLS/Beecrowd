package main

import (
	"fmt"
)

func main() {

  var cod_p1, n_p1, valor_p1, cod_p2, n_p2, valor_p2 float64

  fmt.Scan(&cod_p1, &n_p1, &valor_p1)
  fmt.Scan(&cod_p2, &n_p2, &valor_p2)

  valor_final := (n_p1 * valor_p1) + (n_p2 * valor_p2)

  fmt.Printf("VALOR A PAGAR: R$ %.2f\n", valor_final)
  
}
