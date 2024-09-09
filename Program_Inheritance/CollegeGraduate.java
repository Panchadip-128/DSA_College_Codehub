public class CollegeGraduate extends Person {
    private double gpa;
    private int graduationYear;

    // Constructor
    public CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate);
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    // Accessor methods
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
