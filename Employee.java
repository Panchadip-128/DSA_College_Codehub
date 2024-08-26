package pan_002;

import java.util.Scanner;

class Employee {
     String ename;
     int eid;
     double basic;
     double DA;
     double grossSalary;
     double IT;

    
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        ename = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        eid = scanner.nextInt();
        System.out.print("Enter basic salary: ");
        basic = scanner.nextDouble();
        //System.out.print("Enter DA (Dearness Allowance): ");
        //DA = scanner.nextDouble();
    }

    
    public void compute_net_sal() {
        DA= 0.52*basic;
        grossSalary = basic + DA;
        IT= 0.3*grossSalary;
        
    }

    
    public void display() {
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee ID: " + eid);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("IT: " + IT);
        
        
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.read();
        emp.compute_net_sal();
        emp.display();
    }
}
