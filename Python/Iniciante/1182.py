matriz = []

C = int(input())
T = input()
soma_coluna = 0

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)
    
for i in range(12):
    soma_coluna += matriz[i][C]
    
if T == 'S':
    print(f"{soma_coluna:.1f}")
else:
    print(f"{soma_coluna / 12:.1f}")
