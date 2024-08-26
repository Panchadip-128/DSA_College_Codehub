package pan_002;

import java.util.Scanner;

public class reversepallindrome {

	
	
		public static void main(int n,int rev,int r,int c) {
			c=n;
	while(n>0) {
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	
	System.out.println(" the reverse of the entered  number is : "+rev);

	if(rev==c) {
		System.out.println(" palindrome");
	}
	else
		
		{System.out.println(" not a palindrome");}}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int c;
			System.out.println("Enter the number: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			main(n,0,0,0);}
		
}
