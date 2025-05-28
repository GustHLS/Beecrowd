N = int(input())

for _ in range(N):
    impares = []
    X, Y = input().split()

    x = int(X)
    y = int(Y)

    while len(impares) < y:
        if x % 2 == 1:
            impares.append(x)

        x += 1

    print(sum(impares))
