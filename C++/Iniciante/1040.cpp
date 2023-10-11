#include <stdio.h>
#include <iostream>
#include <vector>
#include <algorithm>

int main() {

  double n1, n2, n3, n4, media, n5, peso1 = 2.0, peso2 = 3.0, peso3 = 4.0, peso4 = 1.0, soma_pesos = peso1 + peso2 + peso3 + peso4;
  std::cin >> n1 >> n2 >> n3 >> n4;

  media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4)) / soma_pesos;

  printf("Media: %.1lf\n", media);

  if (media >= 7.0){
    std::cout << "Aluno aprovado.\n";
  }else if (media >= 5 && media <= 6.9){
    std::cout << "Aluno em exame.\n";

    std::cin >> n5;
    printf("Nota do exame: %.1lf\n", n5);
    
    media = (media + n5) / 2.0;

    if (media >= 5.0){
      std::cout << "Aluno aprovado.\n";
    }else{
      std::cout << "Aluno reprovado.\n";
    }

    printf("Media final: %.1lf\n", media);
    
  }else{
    std::cout << "Aluno reprovado.\n";
  }

}
