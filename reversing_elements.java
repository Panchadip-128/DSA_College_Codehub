package pan_002;
import java.util.Scanner;

public class reversing_elements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of elements : ");
		int n=sc.nextInt();
		
		int ar1[]=new int[n];
		
		System.out.println("enter elements of array : ");
		for (int i=0; i<n; i++)
			ar1[i]=sc.nextInt();

		System.out.println("the array is as : ");
		for (int i=0; i<n; i++)
			System.out.print(ar1[i]+"  ");

		System.out.println("the reversed array is as : ");
		for (int i=n-1; i>=0; i--)
			System.out.print(ar1[i]+"  ");

	}

}
