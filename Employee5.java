package application;

class Employee{
	String name;
	int id;
	
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public void 
	calculateSalary() {}
	
	public void displayEmployeeDetails() {
			System.out.println("Name:"+name+", ID"+id);
			
		}
	}
	
	class FullTimeEmp extends Employee {
		double bonus;
		double deductions;
		double baseSalary;
		
		public FullTimeEmp(String name, int id, double baseSalary,double bonus, double deductions) {
			super(name, id);
			
			this.baseSalary=baseSalary;
			this.bonus=bonus;
			this.deductions=deductions;
		}
		
		@Override
		public void calculateSalary() {
			double totalSalary=baseSalary+bonus-deductions;
			
			System.out.println("Total Salary for Full Time Employee:"+totalSalary);
		}
		
		@Override
		public void displayEmployeeDetails() {
			super.displayEmployeeDetails();
			
			
			System.out.println("Base Salary:"+baseSalary+"Bonus="+bonus+"Deductions="+deductions);
	}
}
	
	
class PartTimeEmp extends Employee{
	int hoursWorked;
	static final double hr=20.0;
	
	public PartTimeEmp(String name,int id,int hoursWorked) {
		super(name,id);
		
		this.hoursWorked=hoursWorked;
	}
	
	@Override
	public void calculateSalary() {
		double salary=hoursWorked*hr;
		
		System.out.println("Salary for Parttime employee"+salary);
		
	}
	
	@Override
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();
		
		System.out.println("Hours Worked:"+ hr);
		
	}
}


public class Employee5 {
		public static void main(String args[]) {
			FullTimeEmp fte=new FullTimeEmp("Alice",1,30000,5000,500);
			PartTimeEmp pte=new PartTimeEmp("Bob",2,40);
			
			fte.calculateSalary();
			fte.displayEmployeeDetails();
			
			pte.calculateSalary();
			pte.displayEmployeeDetails();
			
			
			
		}
}
