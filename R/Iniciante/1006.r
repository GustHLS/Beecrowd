input <- file('stdin', 'r')

a <- as.double(readLines(input, n = 1))
b <- as.double(readLines(input, n = 1))
c <- as.double(readLines(input, n = 1))

peso1 <- 2.0
peso2 <- 3.0
peso3 <- 5.0
soma_pesos = peso1 + peso2 + peso3

media = ((a * peso1) + (b * peso2) + (c * peso3)) / soma_pesos

cat(sprintf("MEDIA = %.1f\n", media))
