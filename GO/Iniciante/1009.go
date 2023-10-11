package main

import (
	"fmt"
)

func main() {

  var nome string
  var salario float64
  var valor_vendas float64

  fmt.Scan(&nome)
  fmt.Scan(&salario)
  fmt.Scan(&valor_vendas)

  salario += valor_vendas * 0.15

  fmt.Printf("TOTAL = R$ %.2f\n", salario)
  
}
