// Soma entre 2 valores versao 2

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
})

leia.question('Digite o primeiro valor: ', (valor1) => {
    leia.question('Digite o segundo valor: ', (valor2) => {
        const resultado = parseFloat(valor1) + parseFloat(valor2);
        console.log(`${valor1} + ${valor2} = ${resultado}`);
        leia.close();
    });
});
