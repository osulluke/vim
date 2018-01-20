#include <stdio.h>
#include <stdlib.h>

int main(void) {
	for(int i = 0; i<100; i += 1) {
		printf("i = %d, and i*i = %d\n", i, i*i);
	}

	return 0;
}
