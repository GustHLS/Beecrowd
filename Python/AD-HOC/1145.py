x, y = list(map(int, input().split()))
cont = 1
for i in range(1, (int((y / x)) + 1)):
    resultado = ""
    for y in range(x):
        resultado += str(cont) + " "
        cont += 1
    print(resultado[:-1])
