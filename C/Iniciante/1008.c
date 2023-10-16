#include <stdio.h>

int main() {

  int n;
  double n_trab, valor_hora, salario;

  scanf("%d", &n);
  scanf("%lf", &n_trab);
  scanf("%lf", &valor_hora);
  
  salario = n_trab * valor_hora;

  printf("NUMBER = %d\nSALARY = U$ %.2lf\n", n, salario);
  
  return 0;
  
}
