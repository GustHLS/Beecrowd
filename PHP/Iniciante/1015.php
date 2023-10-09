<?php

list($x1, $y1) = explode(" ", readline());

$x1 = floatval($x1);
$y1 = floatval($y1);

list($x2, $y2) = explode(" ", readline());

$x2 = floatval($x2);
$y2 = floatval($y2);

$distancia = number_format(sqrt(pow($x2 - $x1, 2) + pow($y2 - $y1, 2)), 4, '.', '');

echo "$distancia\n";
  
?>
