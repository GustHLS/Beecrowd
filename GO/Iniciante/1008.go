package main

import (
	"fmt"
)

func main() {

  var n int
  var horas, salario float64

  fmt.Scan(&n)
  fmt.Scan(&horas)
  fmt.Scan(&salario)

  salario *= horas
  
  fmt.Printf("NUMBER = %d\n", n)
  fmt.Printf("SALARY = U$ %.2f\n", salario)
  
}
