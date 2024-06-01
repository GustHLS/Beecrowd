n = int(input())
x = []
a = list(map(int,input().split()))
pos = 0

for i in range(n):
    x.insert(i, a[i])

print(f"Menor valor: {min(x)}")

for i in range(n):
    if x[i] == min(x):
        pos = i

print(f"Posicao: {pos}")
