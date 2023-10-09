<?php

$tempo = intval(readline());
$vel_media = intval(readline());

$litros = number_format($tempo * $vel_media / 12, 3, '.', '');

echo "$litros\n";
  
?>
