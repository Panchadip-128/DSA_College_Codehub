#include <stdio.h>
#include <stdlib.h>

void printNGE(int arr[], int n) {
int *nge = (int *)malloc(n * sizeof(int));
int *stack = (int *)malloc(n * sizeof(int));
int top = -1;
int i,j;

for (i = n - 1; i >= 0; i--) {
    while (top != -1 && stack[top] <= arr[i]) {
        top--;
    }
    if (top == -1) {
        nge[i] = -1;
    } else {
        nge[i] = stack[top];
    }
    stack[++top] = arr[i];
}

    for (i = 0; i < n; i++) {
        printf("%d -> %d\n", arr[i], nge[i]);
    }

    free(nge);
    free(stack);
}

int main() {
    int arr[] = {13, 27, 16, 12, 25, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    printNGE(arr, n);
    return 0;
}
