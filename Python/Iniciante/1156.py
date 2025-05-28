s = 0
for i in range(20):
    numerador = 2 * i + 1
    denominador = 2 ** i
    s += numerador / denominador

print(f"{s:.2f}")
