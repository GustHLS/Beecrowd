#include <stdio.h>
#include <iostream>

int main() {
  
  std::string nome;
  double salario, vendas;

  std::cin >> nome;
  std::cin >> salario;
  std::cin >> vendas;

  salario += vendas * 0.15;

  printf("TOTAL = R$ %.2lf\n", salario);
  
}
