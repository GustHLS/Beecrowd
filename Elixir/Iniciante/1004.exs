n1 = IO.gets("") |> String.trim()
n2 = IO.gets("") |> String.trim()

n1 = String.to_integer(n1)
n2 = String.to_integer(n2)

prod = n1 * n2

IO.puts "PROD = #{prod}"
