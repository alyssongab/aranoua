// Exemplo com switch

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
})

leia.question('Digite 1, 2 ou 3: ', (op) => {
    switch (op) {
       
        case '1': console.log('Você digitou 1');
        break;

        case '2': console.log('Você digitou 2');
        break;
        
        case '3': console.log('Você digitou 3');
        break;

        default: console.log('Valor inválido');
        break;

    }

    leia.close();

});