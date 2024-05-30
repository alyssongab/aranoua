/*

sintaxe:

tipo nomeMatriz[lin][col];

ex:

int mat [3][4];


*/

#include <stdio.h>

int main () {
	
	int mat[3][3];
	
	for (int i = 0; i < 3; i++) {
		
		for (int j = 0; j < 3; j++) {
			printf("Insira o valor da posicao %i %i: ", i, j);
			
			scanf("%i", &mat[i][j]);
		}
	}
	
	printf("\nMatriz: \n");
	
	for (int lin = 0; lin < 3; lin++) {
		
		for(int col = 0; col < 3; col++) {
			printf("%d ", mat[lin][col]);
			
		}
		
		printf("\n");
	}
	
	printf("");
	
	return 0;
}




