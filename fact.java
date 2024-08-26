package pan_002;

import java.util.Scanner;

public class fact {

	
		
		public static int fact(int n, int fact, int i) {	
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}	
		return fact;
		}
	
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number n: ");
			int n=sc.nextInt();
			System.out.println("Enter r: ");
			
		
			int r=sc.nextInt();
			
			System.out.println("the factorial of the given number is : " + fact(n,1,1));
			
			System.out.println("the nCr of the given number is  "  + ((fact(n,1,1)/(fact(r,1,1)*fact(n-r,1,1)))));

		}
}
