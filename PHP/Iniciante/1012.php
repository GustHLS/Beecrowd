<?php

list($a, $b, $c) = explode (" ", readline());

$a = floatval($a);
$b = floatval($b);
$c = floatval($c);
$pi = 3.14159;

$triangulo = number_format(($a * $c) / 2, 3, '.', '');
$circulo = number_format($pi * pow($c, 2), 3, '.', '');
$trapezio = number_format(($a + $b) * $c / 2, 3, '.', '');
$quadrado = number_format($b * $b, 3, '.', '');
$retangulo = number_format($a * $b, 3, '.', '');

echo "TRIANGULO: $triangulo\n";
echo "CIRCULO: $circulo\n";
echo "TRAPEZIO: $trapezio\n";
echo "QUADRADO: $quadrado\n";
echo "RETANGULO: $retangulo\n";

  
?>
