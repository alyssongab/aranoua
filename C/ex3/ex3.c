/*
Leia um vetor de cinco posições e um valor inteiro; 
multiplique o valor lido pelo vetor e armazene o resultado no próprio vetor; 
mostre o vetor antes e após a multiplicação.
*/

#include <stdio.h>

int main () {
	
	int vet[5];
	int num;
	int vetM[5];
	
	printf(" ** Criando o vetor ** \n");
	
	for (int i = 0; i < 5; i++) {
		printf("Insira o valor da posicao %i: ", i+1);
		scanf("%i", &vet[i]);
	}
	
	printf("Insira um numero inteiro para multiplicar o vetor: ");
	scanf("%i", &num);
	
	for (int i = 0; i < 5; i++) {
		vetM[i] = num*vet[i];
	}
	
	printf("\nVetor antes da multiplicacao: [");
	for (int i = 0; i < 5; i++) {
		if (i > 0) {
			printf(", ");
		}
		printf("%i", vet[i]);
	}
	printf("]");
	
	printf("\nVetor apos a multiplicacao: [");
	for (int i = 0; i < 5; i++) {
		if (i > 0) {
			printf(", ");
		}
		printf("%i", vetM[i]);
	}
	printf("]");
	
	return 0;
}