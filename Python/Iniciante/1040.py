n1, n2, n3, n4 = input().split()
n1 = float(n1)
n2 = float(n2)
n3 = float(n3)
n4 = float(n4)

p1 = 2
p2 = 3
p3 = 4
p4 = 1

media = (n1*p1 + n2*p2 + n3*p3 + n4*p4) / (p1+p2+p3+p4)

if media >= 7.0: 
  print(f"Media: {media:.1f}")
  print("Aluno aprovado.")
  exame = False
  
elif media < 5.0: 
  print(f"Media: {media:.1f}")
  print("Aluno reprovado.")
  exame = False
  
elif 5.0 <= media <= 6.9: 
  print(f"Media: {media:.1f}")
  print("Aluno em exame.")
  exame = True

if exame:
  n5 = float(input())
  print(f"Nota do exame: {n5:.1f}")

  media = (media + n5) / 2

  if media >= 5.0: 
    print("Aluno aprovado.")
  else: 
    print("Aluno reprovado.")
  
  print(f"Media final: {media:.1f}")
