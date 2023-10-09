#include <stdio.h>
#include <iostream>

int main() {
  
  int A, B, C, D;

  std::cin >> A;
  std::cin >> B;
  std::cin >> C;
  std::cin >> D;

  int DIFERENCA = (A * B - C * D);
  
  printf("DIFERENCA = %d\n", DIFERENCA);
  
}
