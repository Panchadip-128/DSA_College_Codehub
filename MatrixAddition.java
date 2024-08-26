

package cseb6;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int p, q, m, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the first matrix: ");
        p = sc.nextInt(); 

        System.out.print("Enter the number of columns in the first matrix: ");
        q = sc.nextInt(); 
        
        System.out.print("Enter the number of rows in the second matrix: ");
        m = sc.nextInt(); 

        System.out.print("Enter the number of columns in the second matrix: ");
        n = sc.nextInt(); 
        
        if (p == m && q == n) {
            int[][] matrix1 = new int[p][q]; 
            int[][] matrix2 = new int[m][n]; 
            int[][] resultMatrix = new int[m][n]; 

            
            System.out.println("Enter all the elements of the first matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            
            System.out.println("\nEnter all the elements of the second matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            
            System.out.println("\nResultant Matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix sizes are not equal. Please try again.");
        }
    }
}
