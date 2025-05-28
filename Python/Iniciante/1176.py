T = int(input())
X = 0

for _ in range(T):
    N = int(input())

    a, b = 0, 1
    for _ in range(N):
        a, b = b, a + b

    print(f"Fib({N}) = {a}")
