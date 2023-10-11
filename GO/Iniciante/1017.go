package main

import (
	"fmt"
)

func main() {

  var tempo, vel_media float64
  fmt.Scan(&tempo)
  fmt.Scan(&vel_media)
  
  litros := vel_media / 12.0
  litros *= tempo

  fmt.Printf("%.3f\n", litros)

}
