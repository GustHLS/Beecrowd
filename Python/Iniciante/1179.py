pares = []
impares = []

for _ in range(15):
    x = int(input())
    if x % 2 == 0: pares.append(x)
    else: impares.append(x)

    if len(pares) == 5:
        for i, numero in enumerate(pares):
            print(f"par[{i}] = {numero}")
        pares = []

    if len(impares) == 5:
        for i, numero in enumerate(impares):
            print(f"impar[{i}] = {numero}")
        impares = []

for i, numero in enumerate(impares):
    print(f"impar[{i}] = {numero}")

for i, numero in enumerate(pares):
    print(f"par[{i}] = {numero}")
