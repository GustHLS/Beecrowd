comissao = 0.15
nome = input()
sal_fixo = float(input())
valor_vendas = float(input())

total = (valor_vendas * comissao) + sal_fixo
print(f"TOTAL = R$ {total:.2f}")
