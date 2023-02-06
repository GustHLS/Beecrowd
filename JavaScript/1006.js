var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

a = parseFloat(lines.shift()) * 2
b = parseFloat(lines.shift()) * 3
c = parseFloat(lines.shift()) * 5
soma_pesos = 2 + 3 + 5

media = (a + b + c) / soma_pesos

console.log(`MEDIA = ${media.toFixed(1)}`)
