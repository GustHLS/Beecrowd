<?php

$a = floatval(readline());
$b = floatval(readline());
$peso1 = 3.5;
$peso2 = 7.5;

$media = number_format((($a * $peso1) + ($b * $peso2)) / 11, 5, '.', '');

echo "MEDIA = {$media}\n";

?>
