var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

n1 = parseInt(lines.shift())
n2 = parseInt(lines.shift())
soma = n1 + n2

console.log(`SOMA = ${soma}`)
