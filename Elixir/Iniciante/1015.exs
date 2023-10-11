valores = IO.gets("") |> String.trim()
valores2 = IO.gets("") |> String.trim()

vetor1 = String.split(valores, " ") |> Enum.map(&String.trim/1)
vetor2 = String.split(valores2, " ") |> Enum.map(&String.trim/1)

x1 = Enum.at(vetor1, 0) |> String.to_float
y1 = Enum.at(vetor1, 1) |> String.to_float

x2 = Enum.at(vetor2, 0) |> String.to_float
y2 = Enum.at(vetor2, 1) |> String.to_float

distancia = :math.sqrt(:math.pow(x2 - x1, 2) + :math.pow(y2 - y1, 2))

IO.puts "#{:erlang.float_to_binary(distancia, decimals: 4)}"
