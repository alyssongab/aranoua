const readline = require('readline'); 
const read = readline.Interface({
    input: process.stdin,
    output: process.stdout
});

/* read.question("Valor 1: ", (valor1) => {
    read.question("Valor 2: ", (valor2) => {
        read.question("Valor 3: ", (valor3) => {
        const val1 = parseFloat(valor1);
        const val2 = parseFloat(valor2);
        const val3 = parseFloat(valor3);
        const res = (val1 + val2 + val3) / 3;
        console.log(res.toFixed(1));
        read.close();
        });
    });
}); */

let num1, num2, num3; 

function leiaNum1() {
    read.question("Digite o primeiro valor: ", (input) => {
        num1 = Number(input);
        leiaNum2();
    })
}

function leiaNum2() {
    read.question("Digite o segundo valor: ", (input) => {
        num2 = Number(input);
        leiaNum3();
    })
}

function leiaNum3() {
    read.question("Digite o terceiro valor: ", (input) => {
        num3 = Number(input);
        calcularMedia();
    })
}

function calcularMedia() {
    const media = (num1 + num2 + num3) / 3;
    media = media.toFixed(1);
    console.log(`A média é ${media}`);
    read.close();
}

leiaNum1();