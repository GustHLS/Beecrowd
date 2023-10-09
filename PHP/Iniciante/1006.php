<?php

$a = floatval(readline());
$b = floatval(readline());
$c = floatval(readline());
$peso1 = 2;
$peso2 = 3;
$peso3 = 5;

$media = number_format((($a * $peso1) + ($b * $peso2) + ($c * $peso3)) / 10, 1, '.', '');

echo "MEDIA = {$media}\n";

?>
