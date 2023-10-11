#include <stdio.h>
#include <iostream>

int main() {

  double valor;
  std::cin >> valor;

  if (0 <= valor && valor <= 25){
    std::cout << "Intervalo [0,25]\n";
  }else if (25.01 <= valor && valor <= 50){
    std::cout << "Intervalo (25,50]\n";
  }else if (50.01 <= valor && valor <= 75){
    std::cout << "Intervalo (50,75]\n";
  }else if (75.01 <= valor && valor <= 100){
    std::cout << "Intervalo (75,100]\n";
  }else{
    std::cout << "Fora de intervalo\n";
  }

}
