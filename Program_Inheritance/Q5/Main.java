public class Main {
    public static void main(String[] args) {
        // Creating objects of Rectangle, Triangle, and Square
        Figure rectangle = new Rectangle(10, 5);
        Figure triangle = new Triangle(10, 5);
        Figure square = new Square(5);

        // Displaying the areas
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
