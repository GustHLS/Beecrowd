matriz = []

T = input()
soma_matriz = 0

for i in range(12):
  linha = []
  for j in range(12):
    n = float(input())
    linha.append(n)
  matriz.append(linha)  

limite = 11
qtde_somada = 0
for i in range(12):
  for j in range(12):
    if j >= limite:
      pass
    else:
      soma_matriz += matriz[i][j]
      qtde_somada += 1
  limite -= 1

if T == 'S':
  print(f"{soma_matriz:.1f}")
else:
  print(f"{soma_matriz/qtde_somada:.1f}")
