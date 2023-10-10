var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

segundos = lines.shift()
segundos = parseInt(segundos)
minutos = 0
horas = 0

horas = Math.floor(segundos / 3600)
segundos %= 3600

minutos = Math.floor(segundos / 60)
segundos %= 60

console.log(`${horas}:${minutos}:${segundos}`)
