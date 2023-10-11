input <- file('stdin', 'r')

A <- as.integer(readLines(input, n = 1))
B <- as.integer(readLines(input, n = 1))

soma = A + B

cat(sprintf("SOMA = %d\n", soma))
