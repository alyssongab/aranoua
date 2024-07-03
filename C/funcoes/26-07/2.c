#include <stdio.h>

int dobro(int n) {
	return 2*n;
}

int main () {
	
	int n;
	
	printf("numero: ");
	scanf("%i", &n);
	
	printf("%i", dobro(n));
	
	return 0;
}