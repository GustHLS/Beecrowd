#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {
  
  double pi = 3.14159, area, raio;
  std::cin >> raio;

  area = pi * std::pow(raio, 2);

  printf("A=%.4lf\n", area);
  
}
