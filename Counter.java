package pan_002;

public class Counter {
    
    private static int count = 0;

    
    public Counter() {
        count++;
    }


    public static void showCount() {
        System.out.println("Number of Counter objects created: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter(); 
        Counter c2 = new Counter(); 
        Counter c3 = new Counter(); 
        Counter.showCount(); 

        Counter c4 = new Counter(); 
        Counter.showCount(); 
    }
}
