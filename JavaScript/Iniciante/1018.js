var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

valor = lines.shift()
valor = parseFloat(valor)

console.log(`${valor}`)
console.log(`${Math.floor(valor / 100)} nota(s) de R$ 100,00`)
valor %= 100

console.log(`${Math.floor(valor / 50)} nota(s) de R$ 50,00`)
valor %= 50

console.log(`${Math.floor(valor / 20)} nota(s) de R$ 20,00`)
valor %= 20

console.log(`${Math.floor(valor / 10)} nota(s) de R$ 10,00`)
valor %= 10

console.log(`${Math.floor(valor / 5)} nota(s) de R$ 5,00`)
valor %= 5

console.log(`${Math.floor(valor / 2)} nota(s) de R$ 2,00`)
valor %= 2

console.log(`${Math.floor(valor / 1)} nota(s) de R$ 1,00`)
valor %= 1
