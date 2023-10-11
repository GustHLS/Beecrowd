#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {
  
  int raio;
  double volume, pi = 3.14159;
  std::cin >> raio;
  
  volume = (4.0/3.0) * pi * std::pow(raio, 3);
  
  printf("VOLUME = %.3lf\n", volume);
  
}
