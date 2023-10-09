a = IO.gets("") |> String.trim()
b = IO.gets("") |> String.trim()

a = String.to_float(a)
b = String.to_float(b)

peso1 = 3.5
peso2 = 7.5
soma_pesos = peso1 + peso2
media = ((a * peso1) + (b * peso2)) / soma_pesos
IO.puts "MEDIA = #{:erlang.float_to_binary(media, decimals: 5)}"
