#include <stdio.h>

int main() {

  double volume, pi = 3.14159;
  int raio;

  scanf("%d", &raio);
  
  volume = (4.0 / 3.0) * pi * pow(raio, 3);

  printf("VOLUME = %.3lf\n", volume);
  
  return 0;
  
}
