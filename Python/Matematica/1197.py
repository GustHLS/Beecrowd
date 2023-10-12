try:
    while True:
        velocidade, aceleracao = map(int, input().split())

        velocidade *= aceleracao * 2

        print(velocidade)

except EOFError: ...
