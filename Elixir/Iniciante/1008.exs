n = IO.gets("") |> String.trim() |> String.to_integer
n_horas = IO.gets("") |> String.trim() |> String.to_integer
valor_horas = IO.gets("") |> String.trim() |> String.to_float

salario = n_horas * valor_horas

IO.puts "NUMBER = #{n}"
IO.puts "SALARY = U$ #{Float.to_string(salario, decimals: 2)}"
