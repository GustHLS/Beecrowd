import math

dias = int(input())

ano = 0
mes = 0
dia = 0

ano = math.floor(dias / 365)
dias %= 365

mes = math.floor(dias / 30)
dias %= 30

dia = dias

print(f"{ano} ano(s)\n{mes} mes(es)\n{dia} dia(s)")
