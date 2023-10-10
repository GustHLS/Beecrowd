var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

a = parseInt(lines.shift())
b = parseInt(lines.shift())
c = parseInt(lines.shift())
d = parseInt(lines.shift())

diferenca = a * b - c * d

console.log(`DIFERENCA = ${diferenca}`)
