matriz = []

L = int(input())
T = input()

for i in range(12):
    linha = []
    for j in range(12):
        linha.append(float(input()))
    matriz.append(linha)

if T == 'S':
    print(f"{sum(matriz[L]):.1f}")
else:
    print(f"{sum(matriz[L]) / 12:.1f}")
