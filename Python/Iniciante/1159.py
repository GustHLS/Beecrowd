while True:
    x = int(input())
    pares = []

    if x == 0:
        break

    while len(pares) < 5:
        if x % 2 == 0:
            pares.append(x)

        x += 1
    print(sum(pares))
