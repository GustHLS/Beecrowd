#include <stdio.h>
 
int main() {
 
  double area, pi = 3.14159, raio;
  scanf("%lf", &raio);
  area = pi * pow(raio, 2);

  printf("A=%.4lf\n", area);
  
  return 0;
  
}
