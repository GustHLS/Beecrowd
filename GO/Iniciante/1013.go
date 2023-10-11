package main

import (
	"fmt"
  "math"
)

func main() {

  var a, b, c float64
  fmt.Scan(&a, &b, &c)

  maiorAB := ((a + b + math.Abs(a - b)) / 2.0)
  maiorABC := ((maiorAB + c + math.Abs(maiorAB - c)) / 2.0)

  fmt.Printf("%.0f eh o maior\n", maiorABC)
  
}
