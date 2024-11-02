package application;

class Person {
    String name;
    String birthDate;
    
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBirthDate() {
        return birthDate;
    }
}

class CollegeGraduate extends Person {
    double gpa;
    int graduationYear;
    
    public CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate);
        
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }
    
    public double getGPA() {
        return gpa;
    }
    
    // Change the return type to int to match graduationYear's data type
    public int getGradYear() {
        return graduationYear;
    }
}

public class Graduate {
    public static void main(String args[]) {
        CollegeGraduate cg = new CollegeGraduate("Alice", "1990-9-12", 4.0, 2012);
        
        System.out.println("Graduation Year: " + cg.getGradYear());
        System.out.println("GPA: " + cg.getGPA());
    }
}
