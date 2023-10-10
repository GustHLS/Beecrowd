var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

n1 = lines.shift()
n2 = lines.shift()

litros = (n2 / 12) * n1

console.log(`${litros.toFixed(3)}`)
