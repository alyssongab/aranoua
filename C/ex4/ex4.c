/*
Leia um vetor de cinco posições e escreva em quais posições foram digitados números ímpares.
*/

#include <stdio.h>

int main () {
	
	int vet[5];
	
	// Criando posições do vetor

	for (int i = 0; i < 5; i++){
		printf("Insira a posicao %i do vetor: ", i+1);
		scanf("%i", &vet[i]);
	}
	
	printf ("Foram digitados numeros impares nas posicoes: ");
		for (int i = 0; i < 5; i++) {
			if (vet[i] % 2 != 0) {
				printf("%i ", i+1);
			}
		}
	
	return 0;
}