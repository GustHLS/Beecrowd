package main
 
import (
    "fmt"
)
 
func main() {

    var A int
    var B int
    
    fmt.Scan(&A)
    fmt.Scan(&B)
    
    var X = A + B
    
    fmt.Printf("X = %d\n", X)

}
