<?php

$km = intval(readline());
$l = floatval(readline());

$kml = number_format($km / $l, 3, '.', '');

echo "$kml km/l\n";
  
?>
