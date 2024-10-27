package application;

import java.util.Random;

class RowSum implements Runnable {
    private int[] row;
    private int rowIndex;
    private int[] rowSums;

    // Constructor to initialize the row and row index for each thread
    public RowSum(int[] row, int rowIndex, int[] rowSums) {
        this.row = row;
        this.rowIndex = rowIndex;
        this.rowSums = rowSums;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        rowSums[rowIndex] = sum;  // Store the row sum in the shared array
        System.out.println("Sum of row " + rowIndex + " = " + sum);
    }
}

public class Lab9_2 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        int[] rowSums = new int[rows];  // Array to store partial sums of each row
        int totalSum = 0;

        // Initialize the matrix with random values
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);  // Random integer between 0 and 9
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Create and start a thread for each row
        Thread[] threads = new Thread[rows];
        for (int i = 0; i < rows; i++) {
            threads[i] = new Thread(new RowSum(matrix[i], i, rowSums));
            threads[i].start();
        }

        // Wait for all threads to complete
        for (int i = 0; i < rows; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate the total sum using rowSums array
        for (int sum : rowSums) {
            totalSum += sum;
        }
        System.out.println("Total sum of matrix = " + totalSum);
    }
}
