public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", "1990-01-01");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Birth Date: " + person.getBirthDate());

        // Creating a CollegeGraduate object
        CollegeGraduate graduate = new CollegeGraduate("Jane Smith", "1995-05-15", 3.8, 2017);
        System.out.println("Graduate Name: " + graduate.getName());
        System.out.println("Graduate Birth Date: " + graduate.getBirthDate());
        System.out.println("Graduate GPA: " + graduate.getGpa());
        System.out.println("Graduate Year of Graduation: " + graduate.getGraduationYear());
    }
}
