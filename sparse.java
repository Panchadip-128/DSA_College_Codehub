#include <stdio.h>

#define MAX 100

int isSparseMatrix(int mat[][MAX], int row, int col) {
    int zeroCount = 0;
    int totalElements = row * col;

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (mat[i][j] == 0) {
                zeroCount++;
            }
        }
    }

    return (zeroCount > (totalElements / 2));
}

int main() {
    int mat[MAX][MAX];
    int row, col;

    printf("Enter the number of rows and columns: ");
    scanf("%d %d", &row, &col);

    printf("Enter the elements of the matrix:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            scanf("%d", &mat[i][j]);
        }
    }

    if (isSparseMatrix(mat, row, col)) {
        printf("The matrix is a sparse matrix.\n");
    } else {
        printf("The matrix is not a sparse matrix.\n");
    }

    return 0;
}
