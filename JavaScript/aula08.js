// Copia aula07 - Saída na mesma linha

const leitura = require('readline');

const leia = leitura.createInterface({
    input: process.stdin,
    output: process.stdout
});

leia.question('Digite seu nome: ', (nome) => {
    let nomes = '';
    for (let i=1; i<=5; i++) {
        nomes += nome + ' ';
    }
    console.log(nomes.trim()); // Função pra limpar strings após nomes; retira o /n
    leia.close();
});