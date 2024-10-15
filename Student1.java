package application;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Student1 {
    int registrationNum;
    String fullName;
    GregorianCalendar doj;
    short semester;
    float GPA;
    float CGPA;

    public Student1(int registrationNum, String fullName, GregorianCalendar doj, short semester, float GPA, float CGPA) {
        this.registrationNum = registrationNum;
        this.fullName = fullName;
        this.doj = doj;
        this.semester = semester;
        this.GPA = GPA;
        this.CGPA = CGPA;
    }

    public String extractInitials() {
        String[] parts = fullName.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String part : parts) {
            initials.append(part.charAt(0));
        }
        return initials.toString();
    }

    public String removeWhiteSpace() {
        return fullName.replaceAll("\\s+", "");
    }

    public void changeToInitials() {
        String[] parts = fullName.split(" ");
        String familyName = parts[parts.length - 1];
        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < parts.length - 1; i++) {
            initials.append(parts[i].charAt(0)).append(". ");
        }
        fullName = initials.toString() + familyName;
    }

    public void display() {
        System.out.println("Registration Number: " + registrationNum);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + doj.getTime());
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + GPA);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student1> students = new ArrayList<>();
        int yearOfJoining = 2024; // Year of joining for all students
        int studentCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter full name:");
            String name = sc.nextLine();

            System.out.println("Enter date of joining (year month day):");
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            System.out.println("Enter semester:");
            short semester = sc.nextShort();

            System.out.println("Enter GPA:");
            float GPA = sc.nextFloat();

            System.out.println("Enter CGPA:");
            float CGPA = sc.nextFloat();
            sc.nextLine();  // Consume newline after nextFloat

            // Increment student count for registration number
            studentCount++;

            // Registration number generation logic
            int registrationNo = (yearOfJoining % 100) * 100 + studentCount;

            // Create a new student object
            Student1 student = new Student1(registrationNo, name, new GregorianCalendar(year, month - 1, day), semester, GPA, CGPA);
            students.add(student);
        }

        // Display all students' details
        System.out.println("\nStudent Records:");
        for (Student1 student : students) {
            student.display();
            System.out.println();
        }

        sc.close();
    }
}
