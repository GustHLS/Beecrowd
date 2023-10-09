qtd = int(input())
valores = {}
menor = []

while qtd > 0:
  linha = input().split(' ')
  valor = float(linha[0])
  gramas = int(linha[1])

  valores[valor] = gramas
  qtd -= 1

for i in valores: menor.append(i * 1000 / valores[i])

menor.sort()
menor = menor[0]
print(f"{menor:.2f}")
