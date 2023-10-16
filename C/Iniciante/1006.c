#include <stdio.h>

int main() {

  double a, b, c, media;
  float p1 = 2;
  float p2 = 3;
  float p3 = 5;

  scanf("%lf", &a);
  scanf("%lf", &b);
  scanf("%lf", &c);
  media = ((a * p1) + (b * p2) + (c * p3)) / (p1 + p2 + p3);

  printf("MEDIA = %.1lf\n", media);
  
  return 0;
  
}
