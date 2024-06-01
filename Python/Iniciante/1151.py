n = int(input())

v = [0] * n

for i in range(0, n):
    if i <= 1: v[i] = i
    else:  v[i] = v[i - 1] + v[i - 2]

    if i == n - 1: print('%d' % (v[i]), end='')
    else: print('%d' % (v[i]), end=' ')

print()
