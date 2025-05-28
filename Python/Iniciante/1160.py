T = int(input())

for _ in range(T):
    anos = 0
    PA, PB, G1, G2 = input().split()

    pa = int(PA)
    pb = int(PB)

    g1 = float(G1)
    g2 = float(G2)

    populacaoA = pa
    populacaoB = pb

    while populacaoA <= populacaoB and anos <= 100:
        anos += 1
        crescimentoA = int(populacaoA * (g1 / 100))
        populacaoA += crescimentoA

        crescimentoB = int(populacaoB * (g2 / 100))
        populacaoB += crescimentoB

    if anos > 100:
        print("Mais de 1 seculo.")
    else:
        print(f"{anos} anos.")
