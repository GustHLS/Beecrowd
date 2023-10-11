#include <stdio.h>
#include <iostream>

int main() {

  int tempo, vel_media;
  double distancia;
  std::cin >> tempo;
  std::cin >> vel_media;
  
  distancia = (vel_media / 12.0) * tempo;

  printf("%.3lf\n", distancia);
    
}
