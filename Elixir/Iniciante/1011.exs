raio = IO.gets("") |> String.trim() |> String.to_integer
pi = 3.14159
volume = (4.0/3.0) * pi * :math.pow(raio, 3)

IO.puts "VOLUME = #{:erlang.float_to_binary(volume, decimals: 3)}"
