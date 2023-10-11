package main

import (
	"fmt"
)

func main() {

  var km, litros float64

  fmt.Scan(&km)
  fmt.Scan(&litros)

  kml := km / litros

  fmt.Printf("%.3f km/l\n", kml)
  
}
