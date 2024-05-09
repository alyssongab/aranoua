// Escreva um programa que leia um valor e verifique se o valor é impar ou par

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
})

leia.question('Digite um valor: ', (valor) => {
    if (valor % 2 === 0) {
        console.log(`O número ${valor} é par`)
   
    }   else {
        console.log(`O número ${valor} é ímpar`)
    }

    leia.close();
});
