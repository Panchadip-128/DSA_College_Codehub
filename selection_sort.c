#include <stdio.h>

void swap(int *xp, int *yp) {
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void recursiveSelectionSort(int arr[], int n, int index) {
    if (index == n) return;

    int min_index = index;
    for (int j = index + 1; j < n; j++) {
        if (arr[j] < arr[min_index]) min_index = j;
    }

    swap(&arr[min_index], &arr[index]);

    recursiveSelectionSort(arr, n, index + 1);
}

int main() {
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr) / sizeof(arr[0]);
    recursiveSelectionSort(arr, n, 0);
    printf("Sorted array: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}
