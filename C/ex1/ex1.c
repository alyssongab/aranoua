// Leia um vetor de 5 posições e escreva Qual o valor está armazenada na posição 3

#include <stdio.h>

main () {
	
	int vet[5];

	for (int i = 0; i < 5; i++) {

		printf("insira o valor da posicao %d: ", i+1);
		scanf("%d", &vet[i]);
	
	}
	
	printf("[ ");
	
	for (int i = 0; i < 5; i++) {
		
		if (i != 0) {
			printf(", ");
		}
		
		printf("%d", vet[i]);
	}

	printf(" ]");
	
	printf("\nvalor da posicao 3: %d", vet[2]);
}