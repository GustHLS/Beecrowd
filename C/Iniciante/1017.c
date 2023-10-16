#include <stdio.h>

int main() {

  int tempo, vel_media;
  double litros;

  scanf("%d", &tempo);
  scanf("%d", &vel_media);
  
  litros = (tempo * vel_media) / 12.0;

  printf("%.3lf\n", litros);
  
  return 0;
}
