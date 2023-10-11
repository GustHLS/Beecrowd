#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {
  double a, b, c, pi = 3.14159;
  std::cin >> a >> b >> c;
  
  double triangulo = (a * c) / 2.0;
  double circulo = pi * (std::pow(c, 2));
  double trapezio = (a + b) * c / 2.0;
  double quadrado = (std::pow(b, 2));
  double retangulo = (a * b);

  printf("TRIANGULO: %.3lf\n", triangulo);
  printf("CIRCULO: %.3lf\n", circulo);
  printf("TRAPEZIO: %.3lf\n", trapezio);
  printf("QUADRADO: %.3lf\n", quadrado);
  printf("RETANGULO: %.3lf\n", retangulo);
  
}
