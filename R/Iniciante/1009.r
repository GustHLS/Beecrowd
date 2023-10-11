input <- file('stdin', 'r')

nome <- readLines(input, n = 1)
salario <- as.double(readLines(input, n = 1))
vendas <- as.double(readLines(input, n = 1))

salario = salario + vendas * 0.15

cat(sprintf("TOTAL = R$ %.2f\n", salario))
