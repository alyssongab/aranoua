#include <stdio.h>
#include <stdlib.h>

int main () {
	
	int vet1[5];
	int vet2[5];
	int vetRes[5];
	
	printf("   ****** VETOR 1 ****** \n");
	
	for (int i = 0; i < 5; i++) {
		
		printf("Insira o valor da posicao %i: ", i+1);
		scanf("%i", &vet1[i]);
		
	}
	
	// ------------- V E T O R - 1 --------------------------------
		printf("VETOR 1: [ ");
		for (int i = 0; i < 5; i++) {
			if (i > 0) {
				printf(", ");
			}
			printf("%i", vet1[i]);
		}
		printf("]\n");
	
	
	printf("\n   ****** VETOR 2 ****** \n");
	
	for (int i = 0; i < 5; i++) {
		
		printf("Insira o valor da posicao %i: ", i+1);
		scanf("%i", &vet2[i]);
		
	}
	
	// ------------- V E T O R - 2 --------------------------------
		printf("VETOR 2: [ ");
		for (int i = 0; i < 5; i++) {
			if (i > 0) {
				printf(", ");
			}
			printf("%i", vet2[i]);
		}
		printf("]\n");
	
	// ------------- V E T O R - RESULTANTE --------------------------------
	
	printf("\n VETOR RESULTANTE: [");
	
	for (int i = 0; i < 5; i++) {

		vetRes[i] = vet1[i] + vet2[i];
	
			if (i > 0) {
				printf(", ");
			}
		
		printf("%i", vetRes[i]);
	}
	
	printf("]");
		
	return 0;
}

/*

Leia dois vetores de cinco posições cada e armazene em um terceiro vetor a soma dos vetores lidos. exiba o vetor resultante

*/