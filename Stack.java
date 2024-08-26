package pan_002;

public class Stack {
    private int[] stack;
    private int tos;

    
    public Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    
    public void push(int value) {
        if (tos >= stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++tos] = value;
        }
    }

    
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return -1; 
        } else {
            return stack[tos--];
        }
    }

    
    public void display() {
        if (tos < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= tos; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  
        stack.pop();
        stack.display(); 
    }
}


