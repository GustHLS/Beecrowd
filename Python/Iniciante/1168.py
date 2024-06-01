leds = (6, 2, 5, 5, 4, 5, 6, 3, 7, 6)
n = int(input())

for _ in range(n):
    total = 0
    valor = input()
    for v in valor:
        total += leds[int(v)]
    print(f"{int(total)} leds")
