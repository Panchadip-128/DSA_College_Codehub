#include <stdio.h>

#define MAX 100

void multiplyMatrices(int mat1[][MAX], int mat2[][MAX], int res[][MAX], int row1, int col1, int col2) {
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            res[i][j] = 0;
            for (int k = 0; k < col1; k++) {
                res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
}

int main() {
    int mat1[MAX][MAX], mat2[MAX][MAX], res[MAX][MAX];
    int row1, col1, row2, col2;

    printf("Enter the number of rows and columns of the first matrix: ");
    scanf("%d %d", &row1, &col1);

    printf("Enter the elements of the first matrix:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++) {
            scanf("%d", &mat1[i][j]);
        }
    }

    printf("Enter the number of rows and columns of the second matrix: ");
    scanf("%d %d", &row2, &col2);

    if (col1 != row2) {
        printf("Matrix multiplication not possible with given dimensions.\n");
        return 0;
    }

    printf("Enter the elements of the second matrix:\n");
    for (int i = 0; i < row2; i++) {
        for (int j = 0; j < col2; j++) {
            scanf("%d", &mat2[i][j]);
        }
    }

    multiplyMatrices(mat1, mat2, res, row1, col1, col2);

    printf("Resultant Matrix:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            printf("%d ", res[i][j]);
        }
        printf("\n");
    }

    return 0;
}
