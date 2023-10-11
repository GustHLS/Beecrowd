input <- file('stdin', 'r')

linha1 <- readLines(input, n = 1)
linha2 <- readLines(input, n = 1)

valores = strsplit(linha1, " ")[[1]]
valores2 = strsplit(linha2, " ")[[1]]

cod_p1 <- as.integer(valores[1])
n_p1 <- as.integer(valores[2])
valor_p1 <- as.double(valores[3])

cod_p2 <- as.integer(valores2[1])
n_p2 <- as.integer(valores2[2])
valor_p2 <- as.double(valores2[3])

valor_final = (n_p1 * valor_p1) + (n_p2 * valor_p2)

cat(sprintf("VALOR A PAGAR: R$ %.2f\n", valor_final))
