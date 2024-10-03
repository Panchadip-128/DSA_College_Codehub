#include <stdio.h>
void checkGroups(int N, int K) {
 // Check if Vignesh (at position K) and Lata (at position K+1) are in the same group of 3
 if ((K - 1) / 3 == K / 3) {
 printf("Yes\n");
 } else {
 printf("No\n");
 }
}
int main() {
 int T; // Number of test cases
 scanf("%d", &T);
 
 while (T--) {
 int N, K;
 scanf("%d %d", &N, &K);
 
 checkGroups(N, K);
 }
 
 return 0;
}
