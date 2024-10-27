package application;

import java.util.ArrayList;
import java.util.List;

// Generic Stack Class
class GenericStack<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}

// Student Class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

// Employee Class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

// Main Class
public class Lab10_2 {
    public static void main(String[] args) {
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Alice"));
        studentStack.push(new Student("Bob"));
        System.out.println("Popped from student stack: " + studentStack.pop());

        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("John"));
        employeeStack.push(new Employee("Jane"));
        System.out.println("Popped from employee stack: " + employeeStack.pop());
    }
}
