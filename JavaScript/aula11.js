// Desenvolva um programa que leia 3 valores e ordene-os na forma crescente

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
})

leia.question('Digite o primeiro valor: ', (val1) => {
    leia.question('Digite o segundo valor: ', (val2) => {
        leia.question('Digite o terceiro valor ', (val3) => {
            const valor1 = parseFloat(val1);
            const valor2 = parseFloat(val2);
            const valor3 = parseFloat(val3);
          
            const ordenacao = [valor1, valor2, valor3].sort((a,b) => a-b);
            console.log('Valores ordenados: ', ordenacao.join(', '));

            leia.close();
        });
    });
});