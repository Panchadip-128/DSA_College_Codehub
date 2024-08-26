package lab_1;
import java.util.*;
import java.util.Scanner;

public class nested_if {
	
	public static int maxNestedIf(int x, int y, int z) {
		if (x>y) {
			if (x>z) {
				return x;
			}
			else {
				return z;
			}
		}
		else {
			if (y>z) {
				return y;

			}
			else {
				return z;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x: ");
		x=sc.nextInt();
		
		System.out.println("enter the value of y: ");
		y=sc.nextInt();
		
		System.out.println("enter the value of z: ");
		z=sc.nextInt();


		System.out.println("the maximum value is: " + maxNestedIf(x, y, z));
	}

}
