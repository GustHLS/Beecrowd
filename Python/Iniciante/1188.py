matriz = []

T = input()
soma_matriz = 0

for i in range(12):
    linha = []
    for j in range(12):
        n = float(input())
        linha.append(n)
    matriz.append(linha) 

qtde_somada = 0
aux = 0
for i in range(11, 6, -1):
    for j in range(11):
        if j != 0 and j + aux < i:
            soma_matriz += matriz[i][j + aux]
            qtde_somada += 1
    aux += 1

if T == 'S':
  print(f"{soma_matriz:.1f}")
else:
  print(f"{soma_matriz/qtde_somada:.1f}")
