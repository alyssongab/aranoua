#include <stdio.h>

int pot(int b, int e) {

	int res = 1;
	
	for (int i = 1; i <=e; i++) {
		res = res * b;
	}
	
	return res;
}

int main () {
	
	int b, exp;
	
	printf("base: ");
	scanf("%i", &b);
	
	printf("exp: ");
	scanf("%i", &exp);
	
	printf("%i",pot(b, exp)); 
	                       
	return 0;
}