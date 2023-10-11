valores = IO.gets("") |> String.trim()
vetor = String.split(valores, " ") |> Enum.map(&String.trim/1)
pi = 3.14159

a = Enum.at(vetor, 0) |> String.to_float
b = Enum.at(vetor, 1) |> String.to_float
c = Enum.at(vetor, 2) |> String.to_float

triangulo = (a * c) / 2.0
circulo = pi * (:math.pow(c, 2.0))
trapezio = (a + b) * c / 2.0
quadrado = (:math.pow(b , 2.0))
retangulo = (a * b)

IO.puts "TRIANGULO: #{:erlang.float_to_binary(triangulo, decimals: 3)}"
IO.puts "CIRCULO: #{:erlang.float_to_binary(circulo, decimals: 3)}"
IO.puts "TRAPEZIO: #{:erlang.float_to_binary(trapezio, decimals: 3)}"
IO.puts "QUADRADO: #{:erlang.float_to_binary(quadrado, decimals: 3)}"
IO.puts "RETANGULO: #{:erlang.float_to_binary(retangulo, decimals: 3)}"
