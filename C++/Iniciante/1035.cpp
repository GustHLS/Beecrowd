#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {

  int a, b, c, d;
  std::cin >> a >> b >> c >> d;

  if (b > c){
    if (d > c){
      if (c+d > a+b){
        if (c > 0 && d > 0){
          if (a % 2 == 0){
            std::cout << "Valores aceitos\n";
          }else{
            std::cout << "Valores nao aceitos\n";
          }
        }else{
          std::cout << "Valores nao aceitos\n";
        }
      }else{
        std::cout << "Valores nao aceitos\n";
      }
    }else{
      std::cout << "Valores nao aceitos\n";
    }
  }else{
    std::cout << "Valores nao aceitos\n";
  }
    
}
