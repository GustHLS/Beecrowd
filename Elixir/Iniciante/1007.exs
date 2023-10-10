a = IO.gets("") |> String.trim() |> String.to_integer
b = IO.gets("") |> String.trim() |> String.to_integer
c = IO.gets("") |> String.trim() |> String.to_integer
d = IO.gets("") |> String.trim() |> String.to_integer

diferenca = (a * b - c * d)

IO.puts "DIFERENCA = #{diferenca}"
