package pan_002;
import java.util.Scanner;

public class prime {

	public static void main (String[] args){
	    int[] array = new int [5];
	    Scanner in = new Scanner (System.in);
	    
	    System.out.println("Enter the elements of the array: ");
	    for(int i=0; i<5; i++)
	    {
	        array[i] = in.nextInt();
	    }
	   
	    for(int i=0; i<array.length; i++){
	        boolean isPrime = true;
	        
	        
	        for (int j=2; j<array[i]; j++){
	            
	            if(array[i]%j==0){
	                isPrime = false;
	                break;
	            
	        }

	public static boolean isPrime(int num) {
	    if (num <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
