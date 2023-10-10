var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

dia = lines.shift()
dia = parseInt(dia)

mes = 0
ano = 0

ano = Math.floor(dia / 365)
dia %= 365

mes = Math.floor(dia / 30)
dia %= 30

console.log(`${ano} ano(s)\n${mes} mes(es)\n${dia} dia(s)`)
