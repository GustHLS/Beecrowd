package main
 
import (
    "fmt"
)
 
func main() {

  var a, b float64

  fmt.Scan(&a)
  fmt.Scan(&b)

  peso1 := 3.5
  peso2 := 7.5
  soma_pesos := peso1 + peso2

  media := ((a * peso1) + (b * peso2)) / soma_pesos

  fmt.Printf("MEDIA = %.5f\n", media)

}
