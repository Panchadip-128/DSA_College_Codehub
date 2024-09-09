public class Main {
    public static void main(String[] args) {
        // Creating a Building object
        Building building = new Building(5000, 3);
        System.out.println("Building Square Footage: " + building.getSquareFootage());
        System.out.println("Building Stories: " + building.getStories());

        // Creating a House object
        House house = new House(2500, 2, 4, 3);
        System.out.println("House Square Footage: " + house.getSquareFootage());
        System.out.println("House Stories: " + house.getStories());
        System.out.println("House Bedrooms: " + house.getBedrooms());
        System.out.println("House Baths: " + house.getBaths());

        // Creating a School object
        School school = new School(10000, 4, 20, "Elementary");
        System.out.println("School Square Footage: " + school.getSquareFootage());
        System.out.println("School Stories: " + school.getStories());
        System.out.println("School Classrooms: " + school.getClassrooms());
        System.out.println("School Grade Level: " + school.getGradeLevel());
    }
}
