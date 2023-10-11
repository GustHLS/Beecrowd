input <- file('stdin', 'r')

a <- as.integer(readLines(input, n=1))
b <- as.integer(readLines(input, n=1))

soma = a + b

cat(sprintf("X = %d\n", soma))
