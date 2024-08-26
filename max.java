package pan_002;

import java.util.Scanner;

public class max {

	public static void max(int x,int y,int z) {
	
         
		if(x>y) {
			if(x>z) {
				System.out.printf("x = %d is the max among the given numbers",x);
			}}
		if(y>x) {
			if(x>z) {
				System.out.printf("y = %d is the max among the given numbers",y);
			}}
		
		if(z>x) {
			if(z>y) {
				System.out.printf("z = %d is the max among the given numbers",z);
			}}}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Enter the numbers x,y and z: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();		
		int z=sc.nextInt();
		
		max(x,y,z);
		
	}
	}


