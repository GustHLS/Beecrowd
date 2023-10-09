n1 = IO.gets("") |> String.trim()
n2 = IO.gets("") |> String.trim()

n1 = String.to_integer(n1)
n2 = String.to_integer(n2)

soma = n1 + n2

IO.puts "X = #{soma}"
