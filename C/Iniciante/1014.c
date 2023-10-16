#include <stdio.h>

int main() {

  int km;
  double kml, total;

  scanf("%d", &km);
  scanf("%lf", &kml);

  total = km / kml;
  
  printf("%.3lf km/l\n", total);

  return 0;
}
