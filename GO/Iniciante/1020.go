package main

import (
	"fmt"
)

func main() {

  var dias int
  fmt.Scan(&dias)

  ano := dias / 365
  dias %= 365

  mes := dias / 30
  dias %= 30

  fmt.Printf("%d ano(s)\n", ano)
  fmt.Printf("%d mes(es)\n", mes)
  fmt.Printf("%d dia(s)\n", dias)
  
}
