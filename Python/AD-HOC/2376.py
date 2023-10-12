oitavas = [["A", "B"], ["C", "D"], ["E", "F"], ["G", "H"], ["I", "J"], ["K", "L"], ["M", "N"], ["O", "P"]]
quartas = []
semi = []
final = []
fases = ['oitavas', 'quartas', 'semi', 'final']


def jogos(fase):

    passaram = []
    for i in range(len(fase)):
        gols = {}
        gol1, gol2 = input().split(" ")
        gol1 = int(gol1)
        gol2 = int(gol2)

        gols[gol1] = fase[i][0]
        gols[gol2] = fase[i][1]

        maior = max(gol1, gol2)
        passaram.append(gols[maior])

        if fase is final:
            campeao = gols[maior]
            print(campeao)

        if len(passaram) == 2:
            if fase is oitavas: quartas.append(passaram)
            elif fase is quartas: semi.append(passaram)
            elif fase is semi: final.append(passaram)
            passaram = []


for item in fases:
    if item == 'oitavas': jogos(oitavas)
    elif item == 'quartas': jogos(quartas)
    elif item == 'semi': jogos(semi)
    elif item == 'final': jogos(final)
