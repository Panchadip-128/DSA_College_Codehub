public class Rectangle extends Figure {
    // Constructor
    public Rectangle(int length, int width) {
        super(length, width);
    }

    // Implementing the area method
    @Override
    public double area() {
        return dimension1 * dimension2;
    }
}
