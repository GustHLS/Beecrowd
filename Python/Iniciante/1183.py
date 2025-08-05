matriz = []

T = input()
soma_matriz = 0

for i in range(12):
  linha = []
  for j in range(12):
    n = float(input())
    linha.append(n)
  matriz.append(linha)  

somador = 0
qtde_somada = 0
for i in range(12):
  iterador = 0
  for j in range(i+1):
    if j != 0:
      soma_matriz += matriz[iterador][somador]
      qtde_somada += 1
      iterador += 1
  somador += 1

if T == 'S':
  print(f"{soma_matriz:.1f}")
else:
  print(f"{soma_matriz/qtde_somada:.1f}")
