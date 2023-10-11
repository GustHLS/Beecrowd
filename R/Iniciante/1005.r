input <- file('stdin', 'r')

a <- as.double(readLines(input, n = 1))
b <- as.double(readLines(input, n = 1))

peso1 <- 3.5
peso2 <- 7.5
soma_pesos = peso1 + peso2

media = ((a * peso1) + (b * peso2)) / soma_pesos

cat(sprintf("MEDIA = %.5f\n", media))
