a, b, c = map(float, input().split())

ordena = [a, b, c]
ordena.sort(reverse=True)

if ordena[0] >= ordena[1] + ordena[2]:
    base = a
    base2 = b
    altura = c

    area = ((base + base2) * altura) / 2

    print(f"Area = {area:.1f}")

else:
    perimetro = a + b + c
    print(f"Perimetro = {perimetro:.1f}")
