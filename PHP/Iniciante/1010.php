<?php

list($cp1, $np1, $vp1) = explode(" ", readline());

$cp1 = intval($cp1);
$np1 = intval($np1);
$vp1 = floatval($vp1);

list($cp2, $np2, $vp2) = explode(" ", readline());

$cp2 = intval($cp2);
$np2 = intval($np2);
$vp2 = floatval($vp2);


$valor1 = $np1 * $vp1;
$valor2 = $np2 * $vp2;
$valor_total = number_format($valor1 + $valor2, 2, '.', '');


echo "VALOR A PAGAR: R$ $valor_total\n";
  
?>
