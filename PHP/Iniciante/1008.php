<?php

$n_func = intval(readline());
$n_horas = intval(readline());
$sal_hora = floatval(readline());

$salario = number_format($n_horas * $sal_hora, 2, '.', '');

echo "NUMBER = {$n_func}\n";
echo "SALARY = U$ {$salario}\n";

?>
