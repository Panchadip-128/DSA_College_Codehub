package pan_002;

import java.util.Arrays;
import java.util.Scanner;

class Mixer {
     int[] arr; 
     int n;

    
   public Mixer(int nn) {
        n = nn;
        arr = new int[n]; 
    }

    
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    
    public Mixer mix(Mixer A) {
        Mixer result = new Mixer(this.n + A.n);
        int i = 0, j = 0, k = 0;
        while (i < this.n && j < A.n) {
            if (this.arr[i] <= A.arr[j]) {
                result.arr[k++] = this.arr[i++];
            } else {
                result.arr[k++] = A.arr[j++];
            }
        }
        while (i < this.n) {
            result.arr[k++] = this.arr[i++];
        }
        while (j < A.n) {
            result.arr[k++] = A.arr[j++];
        }
        return result;
    }

    
    public void display() {
        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        Mixer obj1 = new Mixer(size1);
        obj1.accept();

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        Mixer obj2 = new Mixer(size2);
        obj2.accept();

        Mixer mergedObj = obj1.mix(obj2);
        mergedObj.display();
    }
}
