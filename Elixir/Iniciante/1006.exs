n1 = IO.gets("") |> String.trim() |> String.to_float
n2 = IO.gets("") |> String.trim() |> String.to_float
n3 = IO.gets("") |> String.trim() |> String.to_float

peso1 = 2.0
peso2 = 3.0
peso3 = 5.0
soma_pesos = peso1 + peso2 + peso3

media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / soma_pesos

IO.puts "MEDIA = #{:erlang.float_to_binary(media, decimals: 1)}"
