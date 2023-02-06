var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

n = 3.14159
raio = parseFloat(lines.shift())
area = n * Math.pow(raio, 2)

console.log(`A=${area.toFixed(4)}`)
