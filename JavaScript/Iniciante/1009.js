var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

nome = lines.shift()
sal_fixo = parseFloat(lines.shift())
valor_vendas = parseFloat(lines.shift())
valor_vendas *= 0.15
total = sal_fixo + valor_vendas

console.log(`TOTAL = R$ ${total.toFixed(2)}`)
