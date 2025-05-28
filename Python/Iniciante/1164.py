N = int(input())

for _ in range(N):
    divisores = []
    X = int(input())

    for i in range(1, X+1):
        if X % i == 0 and i != X:
            divisores.append(i)
    soma_divisores = sum(divisores)

    if soma_divisores == X:
        print(f"{X} eh perfeito")
    else:
        print(f"{X} nao eh perfeito")
