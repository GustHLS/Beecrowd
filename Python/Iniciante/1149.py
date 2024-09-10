valores = list(map(int, input().split()))
A = valores[0]

N = next(n for n in valores[1:] if n > 0)

somador = sum(A + i for i in range(N))

print(somador)
