var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

n1 = lines.shift()

distancia = n1 * 2

console.log(`${distancia} minutos`)
