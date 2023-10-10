var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

n_funcionario = parseInt(lines.shift())
n_horas_trabalhadas = parseInt(lines.shift())
sal_hora = parseFloat(lines.shift())

salario = n_horas_trabalhadas * sal_hora

console.log(`NUMBER = ${n_funcionario}`)
console.log(`SALARY = U$ ${salario.toFixed(2)}`)
