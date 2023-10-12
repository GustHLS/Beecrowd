cod, qtd = input().split()
cod = int(cod)
qtd = int(qtd)

itens = {
  1: 4.00,
  2: 4.50,
  3: 5.00,
  4: 2.00,
  5: 1.50
}

item = itens[cod]
valor = item * qtd

print(f"Total: R$ {valor:.2f}")
