X = int(input())

while True:
    Z = int(input())
    if Z > X:
        break

soma = 0
contador = 0
atual = X

while soma <= Z:
    soma += atual
    atual += 1
    contador += 1

print(contador)
