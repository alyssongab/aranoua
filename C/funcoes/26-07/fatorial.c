#include <stdio.h>

int fatorial (int n) {
	
	int fatorial;
		
	if (n == 1 || n == 0) {
		return 1;
	} else {
		
		for (fatorial = 1; n > 1; n--) {
		fatorial = fatorial * n;
		}
	}
	
	return fatorial;
}

int main () {
	
	int n;
	
	printf("numero: ");
	scanf("%i", &n);
	
	printf("%i", fatorial(n));
	
	return 0;
}