#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void menu () {
	
	setlocale(LC_ALL, "portuguese");
	
	printf("\n\tMENU: ");
	
	printf("\n\n\t1. Preencher a matriz");
	printf("\n\t2. Exibir a matriz");
	printf("\n\t3. Exibir uma linha especifica");
	printf("\n\t4. Exibir uma coluna especifica");
	printf("\n\t5. Escrever a diagonal principal");
	printf("\n\t6. Escrever a diagonal inversa");
	printf("\n\t0. Sair");
	printf("\n\tOpcao: ");
}

int main () {
	int mat [4][4];
	int pos;
	int op;
	int matrizPreenchida = 0; // Para controlar se existe ou não uma matriz a ser exibida.
	
	setlocale(LC_ALL, "portuguese");
	
	while (1) {
		menu ();
		scanf("%i", &op);
		
		switch (op) {
			
			case 0: exit (1);
			
			case 1: 
			
				printf("\n\t***** Matriz 4 x 4 ****");
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
						printf("\n\tInsira o valor da posicao %i x %i: ", i+1, j+1);
						scanf("%i", &mat[i][j]);
						}
					} // Fim do laço de inserção de valores
				
				matrizPreenchida = 1;
				break;
			
			case 2:
				
				if (matrizPreenchida == 0) {
					printf("\n\tPor favor, insira valores na matriz! \n");
					break;
				}
				
				printf("\n\t");
				for (int lin = 0; lin < 4; lin++) {
					for(int col = 0; col < 4; col++) {
					printf("%i\t ", mat[lin][col]);			
					}
					// Qubrar linha a cada fim de uma iteração de j
					printf("\n\n\t");
				}
				break;
			
			case 3:
				
				if (matrizPreenchida == 0) {
					printf("\n\tPor favor, insira valores na matriz! \n");
					break;	
				}
				
				printf("\n\tQual linha deseja exibir? ");
				scanf("%i", &pos);
				pos--;
				printf("\n\t[\t");
				
				for (int j = 0; j < 4; j++) {
					printf("%i\t", mat[pos][j]);
				}
				printf("]");
				printf("\n");
				break;
				
			case 4:
				
				if (matrizPreenchida == 0) {
					printf("\n\tPor favor, insira valores na matriz! \n");
					break;
				}
				
				printf("\n\tQual coluna deseja exibir? ");
				scanf("%i", &pos);
				pos--;
				printf("\n\t[\n\n");
				
				for (int i = 0; i < 4; i++) {
					printf("\t %i \n\n", mat[i][pos]);
				}
				printf("\t]");
				printf("\n");
				break;
				
			case 5:
				
				if (matrizPreenchida == 0) {
					printf("\n\tPor favor, insira valores na matriz! \n");
					break;
				}
				
				for (int i = 0; i < 4; i++) {
					printf("\n\t%i ", mat[i][i]);
				}
				printf("\n");
				break;
			
			case 6: 
				
				if (matrizPreenchida == 0) {
					printf("\n\tPor favor, insira valores na matriz! \n");
					break;
				}
				
				for (int i = 0; i < 4; i++) {
					printf("\n\t%i ", mat[i][3-i]);
				}
				printf("\n");
				break;
			
		} // switch
		
	} // while
	
	return 0;
} // main