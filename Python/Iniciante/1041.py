x, y = input().split()
x = float(x)
y = float(y)

dic = {
    x == 0 and y == 0: 'Origem',
    x > 0 and y > 0: 'Q1',
    x < 0 < y: 'Q2',
    x < 0 and y < 0: 'Q3',
    x > 0 > y: 'Q4',
    x > 0 and y == 0 or x < 0 and y == 0: 'Eixo X',
    x == 0 and y > 0 or x == 0 and y < 0: 'Eixo Y',
}

posicao = None
for condicao, valor in dic.items():
    if condicao:
        posicao = valor
        break
        
print(posicao)
