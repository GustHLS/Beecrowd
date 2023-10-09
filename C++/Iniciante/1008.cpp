#include <stdio.h>
#include <iostream>

int main() {
  
  int n, n_horas;
  double valor_hora, salario;

  std::cin >> n;
  std::cin >> n_horas;
  std::cin >> valor_hora;

  salario = n_horas * valor_hora;
  
  printf("NUMBER = %d\nSALARY = U$ %.2lf\n", n, salario);
  
}
