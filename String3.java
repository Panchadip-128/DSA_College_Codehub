package pan_002;

import java.util.GregorianCalendar;

public class String3 {
    private static int registrationCounter = 0;
    private int registrationNumber;
    private String fullName;
    private GregorianCalendar dateOfJoining;
    private short semester;
    private float gpa;
    private float cgpa;


    public String3(String fullName, GregorianCalendar dateOfJoining, short semester, float gpa, float cgpa) {
        registrationCounter++;
        this.registrationNumber = (dateOfJoining.get(GregorianCalendar.YEAR) % 100) * 100 + registrationCounter;
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }


    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining.get(GregorianCalendar.YEAR) + "-" +
                (dateOfJoining.get(GregorianCalendar.MONTH) + 1) + "-" +
                dateOfJoining.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
       
        String3[] students = new String3[5];
        students[0] = new String3("Alice Smith", new GregorianCalendar(2023, 7, 15), (short) 1, 3.5f, 3.5f);
        students[1] = new String3("Bob Johnson", new GregorianCalendar(2023, 7, 16), (short) 1, 3.6f, 3.6f);
        students[2] = new String3("Charlie Brown", new GregorianCalendar(2023, 7, 17), (short) 1, 3.7f, 3.7f);
        students[3] = new String3("Diana Prince", new GregorianCalendar(2023, 7, 18), (short) 1, 3.8f, 3.8f);
        students[4] = new String3("Ethan Hunt", new GregorianCalendar(2023, 7, 19), (short) 1, 3.9f, 3.9f);

    
        for (String3 student : students) {
            student.display();
            System.out.println();
        }
    }
}
