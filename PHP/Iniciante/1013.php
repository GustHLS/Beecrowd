<?php

list($a, $b, $c) = explode(" ", readline());

$a = intval($a);
$b = intval($b);
$c = intval($c);

$maiorAB = ($a + $b + abs($a-$b)) / 2;
$maiorABC = ($maiorAB + $c + abs($maiorAB-$c)) / 2;

echo "$maiorABC eh o maior\n";
  
?>
