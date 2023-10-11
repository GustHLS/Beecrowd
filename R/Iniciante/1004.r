input <- file('stdin', 'r')

A <- as.integer(readLines(input, n = 1))
B <- as.integer(readLines(input, n = 1))

prod = A * B

cat(sprintf("PROD = %d\n", prod))
