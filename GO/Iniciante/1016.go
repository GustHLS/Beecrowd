package main

import (
	"fmt"
)

func main() {

  var km float64
  fmt.Scan(&km)

  km *= 2

  fmt.Printf("%0.f minutos\n", km)

}
