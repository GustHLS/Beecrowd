import math
x1, y1 = input().split()
x2, y2 = input().split()
x1, y1, x2, y2 = float(x1), float(y1), float(x2), float(y2)
d1 = math.pow(x2-x1, 2)
d2 = math.pow(y2-y1, 2)

distancia = math.sqrt(d1 + d2)
print(f"{distancia:.4f}")
