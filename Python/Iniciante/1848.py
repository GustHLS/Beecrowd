gritos = 0
numero_anterior = 0

while gritos < 3:
    sonho = input()
    numero_binario = ""

    if sonho == 'caw caw':
        gritos += 1
        print(numero_anterior)
        numero_anterior = 0
    else:
        for olho in sonho:
            if olho == '*':
                numero_binario += '1'
            else:
                numero_binario += '0'

        decimal = int(numero_binario, 2)
        numero_anterior += decimal
