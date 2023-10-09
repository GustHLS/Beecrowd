raio = IO.gets("") |> String.trim()

raio = String.to_float(raio)
pi = 3.14159

area = pi * (:math.pow(raio, 2))

IO.puts "A=#{Float.to_string(area, decimals: 4)}"
