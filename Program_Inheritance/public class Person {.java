public class Person {
    private String name;
    private String birthDate;

    // Constructor
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
