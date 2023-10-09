<?php

$nome = readline();
$sal_fixo = floatval(readline());
$valor_vendas = floatval(readline());

$salario = number_format($sal_fixo + ($valor_vendas * 0.15), 2, '.', '');

echo "TOTAL = R$ $salario\n"

?>
