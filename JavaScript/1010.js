var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

linha1 = lines.shift().split(" ")
linha2 = lines.shift().split(" ")

cod_p1 = linha1[0]
n_p1 = linha1[1]
valor_p1 = linha1[2]

cod_p2 = linha2[0]
n_p2 = linha2[1]
valor_p2 = linha2[2]

res_p1 = n_p1 * valor_p1
res_p2 = n_p2 * valor_p2
resultado = res_p1 + res_p2

console.log(`VALOR A PAGAR: R$ ${resultado.toFixed(2)}`)
