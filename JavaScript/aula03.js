// Entrada de dados via terminal

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
})

leia.question('Digite seu nome: ', (nome) => {
    console.log(`Olá, ${nome}!`);
    leia.close();
});
