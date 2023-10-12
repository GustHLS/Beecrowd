import math

a, b, c = input().split()

a = float(a)
b = float(b)
c = float(c)

delta = pow(b, 2) - (4 * a * c)

if delta < 0: print("Impossivel calcular")
else:
  try:
    
    r1 = (-b + math.sqrt(delta)) / (2 * a)
    r2 = (-b - math.sqrt(delta)) / (2 * a)
    print(f"R1 = {r1:.5f}\nR2 = {r2:.5f}")
    
  except ZeroDivisionError: print("Impossivel calcular")
