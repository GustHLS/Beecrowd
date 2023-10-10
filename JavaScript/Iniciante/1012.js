var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

linha = lines.shift().split(" ")
a = parseFloat(linha[0])
b = parseFloat(linha[1])
c = parseFloat(linha[2])
pi = 3.14159

triangulo = (a * c) / 2
circulo = pi * Math.pow(c, 2)
trapezio = (a + b) * c / 2
quadrado = b * b
retangulo = a * b

console.log(`TRIANGULO: ${triangulo.toFixed(3)}`)
console.log(`CIRCULO: ${circulo.toFixed(3)}`)
console.log(`TRAPEZIO: ${trapezio.toFixed(3)}`)
console.log(`QUADRADO: ${quadrado.toFixed(3)}`)
console.log(`RETANGULO: ${retangulo.toFixed(3)}`)
