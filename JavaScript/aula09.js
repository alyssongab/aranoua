// Exemplo com while

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
});

leia.question('Digite seu nome: ', (nome) => {
    let i=1;
    while (i<=5) {
        console.log(nome);
        i++;
    }
    leia.close();
});

/* do while

leia.question('Digite seu nome: ', (nome) => {
    let i=1;
    while (i<=5) {
        console.log(nome);
        i++;
    }
    leia.close();
});

*/