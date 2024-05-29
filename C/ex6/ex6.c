/* 
Leia um vetor de 5 posições e substitua a primeira posição pela última, a segunda pela penúltima e assim sucessivamente; 
exiba o vetor antes e após a mudança
*/

#include <stdio.h>

int main () {
	
	int vet[5], vetNovo[5];
	
	for (int i = 0; i < 5; i++) {
		printf("Insira o valor da posicao %i: ", i+1);
		scanf("%i", &vet[i]);	
	}
	
	for (int i = 0; i < 5; i++) {
		vetNovo[i] = vet[4-i];	
	}
	
	printf("\nVetor antes da mudanca: [");
	for (int i = 0; i < 5; i++) {
		printf("%s%i", i == 0 ? "" : ", ", vet[i]);
	}
	printf("]\n");
	
	printf("Vetor apos a mudanca: [");
	for (int i = 0; i < 5; i++) {
		printf("%s%i", i == 0 ? "" : ", ", vetNovo[i]);
	}
	printf("]");
	
	return 0;
}