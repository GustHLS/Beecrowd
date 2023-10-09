#include <stdio.h>
#include <iostream>

int main() {
  
  int cod_p1, n_p1, cod_p2, n_p2;
  double valor_p1, valor_p2, valor_final;

  std::cin >> cod_p1 >> n_p1 >> valor_p1;
  std::cin >> cod_p2 >> n_p2 >> valor_p2;

  valor_final = (n_p1 * valor_p1) + (n_p2 * valor_p2);

  printf("VALOR A PAGAR: R$ %.2lf\n", valor_final);
  
}
