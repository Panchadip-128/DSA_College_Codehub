package application;

public class Student {
	String name;
	int rollNo;
	int age;
	
	public Student() {
		name="Unknown";
		rollNo=0;
		age=0;
	}
	
	public Student(String name,int rollNo,int age) {
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
	}
	
	public void display() {
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Roll No"+rollNo);
		
	}
	
	public static void main(String args[]) {
		Student st1=new Student("John Doe",20,18);
		System.out.println("Student1 details:");
		st1.display();
		
		Student st2=new Student("Peter Sidwick",15,19);
		System.out.println("Student1 details:");
		st2.display();
		
		
	}
}
