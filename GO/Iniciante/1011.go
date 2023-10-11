package main

import (
	"fmt"
  "math"
)

func main() {

  var raio float64
  pi := 3.14159
  fmt.Scan(&raio)
  
  volume := (4.0/3.0) * pi * math.Pow(raio, 3)

  fmt.Printf("VOLUME = %.3f\n", volume)
  
}
