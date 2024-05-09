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
            
            if (valor1 > valor2 && valor1 > valor3) {
                if (valor2 > valor3) {
                    console.log(valor3, valor2, valor1);
                }   else {
                    console.log(valor2, valor3, valor1);
                }
            
            } else if (valor2 > valor1 && valor2 > valor3) {
                if (valor1 > valor3) {
                    console.log(valor3, valor1, valor2);
                }   else {
                    console.log(valor1, valor3, valor2);
                }
           
            } else if (valor3 > valor2 && valor3 > valor1) {
                if (valor2 > valor1) {
                    console.log(valor1, valor2, valor3);
                }   else {
                    console.log(valor2, valor1, valor3);
                }
            }

            leia.close();
        });
    });
});