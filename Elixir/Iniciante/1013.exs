valores = IO.gets("") |> String.trim()
valor = String.split(valores, " ") |> Enum.map(&String.trim/1)

a = Enum.at(valor, 0) |> String.to_integer
b = Enum.at(valor, 1) |> String.to_integer
c = Enum.at(valor, 2) |> String.to_integer

maiorAB = (a + b + abs(a-b)) / 2
maiorABC = (maiorAB + c + abs(maiorAB-c)) / 2

IO.puts "#{:erlang.float_to_binary(maiorABC, decimals: 0)} eh o maior"
