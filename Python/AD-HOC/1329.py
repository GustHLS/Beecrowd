qtd = int(input())

while qtd != 0:
    resultado = []
    resultado_final = []
    resultado.append(list(map(int, input().split(" ")[:qtd])))

    for lista in resultado:
        for item in lista: resultado_final.append(item)

    count_mary = resultado_final.count(0)
    count_john = resultado_final.count(1)

    print(f"Mary won {count_mary} times and John won {count_john} times")
    qtd = int(input())
