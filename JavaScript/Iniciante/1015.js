var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

linha1 = lines.shift().split(" ")
linha2 = lines.shift().split(" ")

x1 = parseFloat(linha1[0])
y1 = parseFloat(linha1[1])

x2 = parseFloat(linha2[0])
y2 = parseFloat(linha2[1])

distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))

console.log(`${distancia.toFixed(4)}`)
