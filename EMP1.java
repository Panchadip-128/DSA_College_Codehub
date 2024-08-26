package pan_002;

class EMPLOYEE {
    
    String name;
    int id;

    
    public EMPLOYEE() {
        this.name = "Unknown";
        this.id = 0;
    }

    
    public EMPLOYEE(String name, int id) {
        this.name = name;
        this.id = id;
    }

   
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
       
        EMPLOYEE emp1 = new EMPLOYEE();
        emp1.display();

        
        EMPLOYEE emp2 = new EMPLOYEE("Alice", 101);
        emp2.display();

        EMPLOYEE emp3 = new EMPLOYEE("Bob", 102);
        emp3.display();
    }
}
