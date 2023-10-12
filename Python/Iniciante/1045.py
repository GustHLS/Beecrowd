import math
a, b, c = map(float, input().split())

ordena = [a, b, c]
ordena.sort()

A = ordena[2]
B = ordena[1]
C = ordena[0]

triangulo = True

if A >= B+C:
    print("NAO FORMA TRIANGULO")
    triangulo = False

if triangulo is True:
    if math.pow(A, 2) == math.pow(B, 2) + math.pow(C, 2): print("TRIANGULO RETANGULO")
    if math.pow(A, 2) > math.pow(B, 2) + math.pow(C, 2): print("TRIANGULO OBTUSANGULO")
    if math.pow(A, 2) < math.pow(B, 2) + math.pow(C, 2): print("TRIANGULO ACUTANGULO")

    contagem_elementos = {}
    for i in ordena:
        contagem = contagem_elementos.get(i, 0)
        contagem_elementos[i] = contagem + 1

    for elemento, contagem in contagem_elementos.items():
        if contagem == 3: print("TRIANGULO EQUILATERO")
        if contagem == 2: print("TRIANGULO ISOSCELES")
