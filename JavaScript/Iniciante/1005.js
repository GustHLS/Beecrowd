var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

a = parseFloat(lines.shift()) * 3.5
b = parseFloat(lines.shift()) * 7.5
soma_pesos = 3.5 + 7.5

media = (a + b) / soma_pesos

console.log(`MEDIA = ${media.toFixed(5)}`)
