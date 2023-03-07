#include <stdio.h>

int main() {

  int a, b, c, maiorAB, maiorABC;

  scanf("%d", &a);
  scanf("%d", &b);
  scanf("%d", &c);

  maiorAB = (a + b + abs(a-b)) / 2;
  maiorABC = (c + maiorAB + abs(maiorAB - c)) / 2;


  printf("%d eh o maior\n", maiorABC);

  return 0;
}
