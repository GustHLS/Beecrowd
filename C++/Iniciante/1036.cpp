#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {

  double a, b, c, delta, x1, x2;
  std::cin >> a >> b >> c;

  delta = std::pow(b, 2) - 4 * a * c;
  
  x1 = (-b + std::sqrt(delta)) / (2 * a);
  x2 = (-b - std::sqrt(delta)) / (2 * a);

  if(std::isnan(x1) || std::isnan(x2)){
    std::cout << "Impossivel calcular\n";
  }else if(std::isinf(x1) || std::isinf(x2)){
    std::cout << "Impossivel calcular\n";
  }else{
    printf("R1 = %.5lf\n", x1);
    printf("R2 = %.5lf\n", x2);
  }

}
