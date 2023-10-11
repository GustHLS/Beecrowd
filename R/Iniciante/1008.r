input <- file('stdin', 'r')

n <- as.integer(readLines(input, n = 1))
n_horas <- as.integer(readLines(input, n = 1))
valor_hora <- as.double(readLines(input, n = 1))

salario = n_horas * valor_hora

cat(sprintf("NUMBER = %d\nSALARY = U$ %.2f\n", n, salario))
