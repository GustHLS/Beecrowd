valor = IO.gets("") |> String.trim()
valor2 = IO.gets("") |> String.trim()

numeros = String.split(valor, " ") |> Enum.map(&String.trim/1)
numeros2 = String.split(valor2, " ") |> Enum.map(&String.trim/1)

cod_p1 = Enum.at(numeros, 0) |> String.to_integer
n_p1 = Enum.at(numeros, 1) |> String.to_integer
valor_p1 = Enum.at(numeros, 2) |> String.to_float

cod_p2 = Enum.at(numeros2, 0) |> String.to_integer
n_p2 = Enum.at(numeros2, 1) |> String.to_integer
valor_p2 = Enum.at(numeros2, 2) |> String.to_float

valor_final = (n_p1 * valor_p1) + (n_p2 * valor_p2)

IO.puts "VALOR A PAGAR: R$ #{Float.to_string(valor_final, decimals: 2)}"
