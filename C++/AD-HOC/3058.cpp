#include <stdio.h>
#include <iostream>
#include <vector>
#include <algorithm>

int main() {

  int qtd;
  double valor, gramas;
  std::vector<double> valores;
  std::cin >> qtd;
  
  while(qtd > 0){
    std::cin >> valor >> gramas;
    valor *= 1000 / gramas;
    valores.push_back(valor);
    qtd--;
  }

  std::sort(valores.begin(), valores.end());

  printf("%.2lf\n", valores[0]);

}
