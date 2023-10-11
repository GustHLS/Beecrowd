#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {

  double valor, reais, moedas;
  std::cin >> valor;

  moedas = std::modf(valor, &reais);
  moedas *= 100;

  valor = reais;
  printf("NOTAS:\n");
  printf("%d nota(s) de R$ 100.00\n", int(valor) / 100);
  valor = int(valor) % 100;
  
  printf("%d nota(s) de R$ 50.00\n", int(valor) / 50);
  valor = int(valor) % 50;
  
  printf("%d nota(s) de R$ 20.00\n", int(valor) / 20);
  valor = int(valor) % 20;

  printf("%d nota(s) de R$ 10.00\n", int(valor) / 10);
  valor = int(valor) % 10;

  printf("%d nota(s) de R$ 5.00\n", int(valor) / 5);
  valor = int(valor) % 5;
  
  printf("%d nota(s) de R$ 2.00\n", int(valor) / 2);
  valor = int(valor) % 2;

  printf("MOEDAS:\n");
  printf("%d moeda(s) de R$ 1.00\n", int(valor));
  valor = int(moedas);
  
  printf("%d moeda(s) de R$ 0.50\n", int(valor) / 50);
  valor = int(valor) % 50;
  
  printf("%d moeda(s) de R$ 0.25\n", int(valor) / 25);
  valor = int(valor) % 25;
  
  printf("%d moeda(s) de R$ 0.10\n", int(valor) / 10);
  valor = int(valor) % 10;
  
  printf("%d moeda(s) de R$ 0.05\n", int(valor) / 5);
  valor = int(valor) % 5;
    
  printf("%d moeda(s) de R$ 0.01\n", int(valor));
    
}
