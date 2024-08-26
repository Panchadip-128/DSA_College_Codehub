package pan_002;
import java.util.Scanner;

public class primenos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < n; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

