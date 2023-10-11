#include <stdio.h>
#include <iostream>

int main() {

  int segundos, horas, minutos;
  std::cin >> segundos;

  horas = segundos / 3600;
  segundos %= 3600;

  minutos = segundos / 60;
  segundos %= 60;

  printf("%d:%d:%d\n", horas, minutos, segundos);
    
}
