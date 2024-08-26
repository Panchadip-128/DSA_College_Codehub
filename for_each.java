package pan_002;

import java.util.*;

class for_each {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int number : arr) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
