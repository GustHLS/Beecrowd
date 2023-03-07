#include <stdio.h>

int main() {

  int cp1, np1, cp2, np2;
  double vp1, vp2, total;

  scanf("%d", &cp1);
  scanf("%d", &np1);
  scanf("%lf", &vp1);

  scanf("%d", &cp2);
  scanf("%d", &np2);
  scanf("%lf", &vp2);

  total = (np1 * vp1) + (np2 * vp2);

  printf("VALOR A PAGAR: R$ %.2lf\n", total);
  
  return 0;
  
}
