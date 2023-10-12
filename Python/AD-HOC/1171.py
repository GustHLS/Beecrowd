qtd = int(input())
armazena = []
aux_armazena = []

for i in range(qtd):
    valor = int(input())
    armazena.append(valor)

for item in armazena:
    if item in aux_armazena: pass
    else: aux_armazena.append(item)

aux_armazena.sort()
for item in aux_armazena:
    print(f"{item} aparece {armazena.count(item)} vez(es)")
