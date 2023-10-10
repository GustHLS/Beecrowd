var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

raio = parseFloat(lines.shift());
pi = 3.14159;

volume = (4.0/3.0) * pi * Math.pow(raio, 3);

console.log(`VOLUME = ${volume.toFixed(3)}`);
