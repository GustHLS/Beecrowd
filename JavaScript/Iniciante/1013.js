var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

linha = lines.shift().split(" ")
a = parseInt(linha[0])
b = parseInt(linha[1])
c = parseInt(linha[2])

maiorAB = (a + b + Math.abs(a - b)) / 2
maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2

console.log(`${maiorABC} eh o maior`);
