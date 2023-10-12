a, b, c = map(int, input().split())

ordena = [a, b, c]
ordena.sort()
for i in ordena:
    print(i)

print(f"\n{a}\n{b}\n{c}")
