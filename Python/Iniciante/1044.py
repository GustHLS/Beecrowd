a, b = map(int, input().split())

if a > b:
    resto = a % b
    if resto == 0: print("Sao Multiplos")
    else: print("Nao sao Multiplos")

else:
    resto = b % a
    if resto == 0: print("Sao Multiplos")
    else: print("Nao sao Multiplos")
