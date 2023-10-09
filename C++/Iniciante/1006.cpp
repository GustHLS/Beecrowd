#include <stdio.h>
#include <iostream>

int main() {
  
  double a, b, c, media, peso1 = 2, peso2 = 3, peso3 = 5, soma_pesos = peso1 + peso2 + peso3;
  std::cin >> a;
  std::cin >> b;
  std::cin >> c;

  media = ((a * peso1) + (b * peso2) + (c * peso3)) / soma_pesos;

  printf("MEDIA = %.1lf\n", media);
  
}
