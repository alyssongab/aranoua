/* 
Leia um vetor de 5 posições; faça o somatório do seu conteúdo e exiba o resultado
*/

#include <stdio.h>

int main() {
	
	int vet[5], sum = 0;
	
	for (int i = 0; i < 5; i++) {
		printf("Insira o valor da posicao %i: ", i+1);
		scanf("%i", &vet[i]);
	}
		
	for (int i = 0; i < 5; i++) {
		sum += vet[i];
	}
	
	printf("Somatorio do conteudo do vetor = %i", sum);
	
	return 0;
}