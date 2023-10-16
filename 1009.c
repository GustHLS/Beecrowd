#include <stdio.h>

int main() {

  char nome;
  double sal_fixo, valor_vendas, salario;

  scanf("%s", &nome);
  scanf("%lf", &sal_fixo);
  scanf("%lf", &valor_vendas);

  salario = sal_fixo + (valor_vendas * 0.15);

  printf("TOTAL = R$ %.2lf\n", salario);
  
  return 0;
  
}
