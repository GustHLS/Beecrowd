#include <stdio.h>
#include <iostream>

int main() {

  int cod, qtd;
  double valor;
  std::cin >> cod >> qtd;

  switch(cod){
    case 1:
      valor = qtd * 4.00;
      break;
    
    case 2:
      valor = qtd * 4.50;
      break;
    
    case 3:
      valor = qtd * 5.00;
      break;
    
    case 4:
      valor = qtd * 2.00;
      break;
    
    case 5:
      valor = qtd * 1.50;
      break;
  }

  printf("Total: R$ %.2lf\n", valor);

}
