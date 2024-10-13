package application;

public class Employee {
	String name;
	int id;
	double salary;
	
	public Employee() {
		name="Unknown";
		id=0;
		salary=0.0;
	}
	
	public Employee(String name,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Salary:"+salary);
	}
	
	
	public static void main(String args[]) {
		Employee emp1=new Employee("Ramachandran A",238,95542.50);
		System.out.println("Employee1 details:");
		emp1.display();
		
		Employee emp2=new Employee("Shivendra Palkon",871,97967.50);
		System.out.println("Employee1 details:");
		emp2.display();
	}
}
