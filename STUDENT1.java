package pan_002;

class STUDENT1{
    
    String name;
    int rollNo;

    
    public STUDENT1() {
        this.name = "Unknown";
        this.rollNo = 0;
    }

    
    public STUDENT1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
       
        STUDENT1 student1 = new STUDENT1();
        student1.display();

        
        STUDENT1 student2 = new STUDENT1("Alice", 101);
        student2.display();

        STUDENT1 student3 = new STUDENT1("Bob", 102);
        student3.display();
    }
}
