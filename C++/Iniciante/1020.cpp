#include <stdio.h>
#include <iostream>

int main() {

  int dias, mes, ano;
  std::cin >> dias;
  
  ano = dias / 365;
  dias %= 365;

  mes = dias / 30;
  dias %= 30;

  printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);
    
}
