#include <stdio.h>
#include <iostream>

int main() {
  
  double a, b, media, peso1 = 3.5, peso2 = 7.5, soma_pesos = peso1 + peso2;
  std::cin >> a;
  std::cin >> b;

  media = ((a * peso1) + (b * peso2)) / soma_pesos;

  printf("MEDIA = %.5lf\n", media);
  
}
