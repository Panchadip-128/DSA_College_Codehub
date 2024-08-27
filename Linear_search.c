#include <stdio.h>

int recursiveLinearSearch(int arr[], int n, int x) {
    if (n == 0) return -1;
    if (arr[n - 1] == x) return n - 1;
    return recursiveLinearSearch(arr, n - 1, x);
}

int main() {
    int arr[] = {2, 3, 4, 10, 40};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 10;
    int result = recursiveLinearSearch(arr, n, x);
    (result == -1) ? printf("Element is not present in array\n")
                   : printf("Element is present at index %d\n", result);
    return 0;
}
