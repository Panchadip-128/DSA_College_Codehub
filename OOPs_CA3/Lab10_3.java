package application;

public class Lab10_3 {

    // Method that accepts a generic stack with an upper-bound wildcard
    public static void printStack(GenericStack<? extends Object> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        // Stack of Students
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Charlie"));
        studentStack.push(new Student("David"));

        // Stack of Employees
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("Eve"));
        employeeStack.push(new Employee("Frank"));

        // Using printStack with wildcard to print both types of stacks
        System.out.println("Printing student stack:");
        printStack(studentStack);

        System.out.println("\nPrinting employee stack:");
        printStack(employeeStack);
    }
}
