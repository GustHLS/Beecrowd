velocidade_lesma = 0

while True:
    try:
        L = int(input())
        velocidade_lesma = list(map(int, input().split()))

        maior_velocidade = max(velocidade_lesma)
        if maior_velocidade < 10:
            print(1)
        if 10 <= maior_velocidade < 20:
            print(2)
        if maior_velocidade >= 20:
            print(3)

    except EOFError:
        break
