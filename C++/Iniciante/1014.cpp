#include <stdio.h>
#include <iostream>
#include <cmath>

int main() {

  int a, b, c, maiorAB, maiorABC;
  std::cin >> a >> b >> c;

  maiorAB = (a + b + abs(a - b)) / 2;
  maiorABC = (maiorAB + c + abs(maiorAB - c)) / 2;

  printf("%d eh o maior\n", maiorABC);
  
}
