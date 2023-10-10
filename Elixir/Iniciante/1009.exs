nome = IO.gets("") |> String.trim()
salario = IO.gets("") |> String.trim() |> String.to_float
vendas = IO.gets("") |> String.trim() |> String.to_float

salario = salario + vendas * 0.15

IO.puts "TOTAL = R$ #{Float.to_string(salario, decimals: 2)}"
