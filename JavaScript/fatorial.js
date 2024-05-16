// Algoritmo para calcular o fatorial de um número

function fatorial(n) {
    
    let fatorial = n;

    if(n < 0) {
        return "Apenas números maiores ou igual a 0!";
    }   

    if (n == 0) {
        fatorial = 1;
        
    }   

    while (n > 1) {
        n--;
        fatorial = fatorial * n;
        
    }
    
    return fatorial;
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Digite o número para ser calculado seu fatorial: ", (num) => {
    const numero = parseInt(num);
    
        if (isNaN(num)) {
            console.log(`${num} não é um número!`);
        
        } else if (numero < 0) {
            console.log(fatorial(numero));
        
        } else {
            const result = fatorial(numero);
            console.log(`O fatorial de ${num} é ${result}`);
        }
    
    rl.close();
});