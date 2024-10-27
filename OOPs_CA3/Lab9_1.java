package application;

//Class to print multiplication table by extending Thread
class MultiplicationTable extends Thread {
 private int number;

 // Constructor to initialize the number for the multiplication table
 public MultiplicationTable(int number) {
     this.number = number;
 }

 // Overriding the run() method to print the multiplication table
 @Override
 public void run() {
     System.out.println("Multiplication Table of " + number + ":");
     for (int i = 1; i <= 10; i++) {
         System.out.println(number + " x " + i + " = " + (number * i));
     }
     System.out.println();
 }
}

//Class to create and run two MultiplicationTable threads
public class Lab9_1 {
 public static void main(String[] args) {
     // Creating two threads for printing tables of 5 and 7
     MultiplicationTable tableOf5 = new MultiplicationTable(5);
     MultiplicationTable tableOf7 = new MultiplicationTable(7);

     // Starting the threads
     tableOf5.start();
     tableOf7.start();
 }
}

