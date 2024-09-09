public class Triangle extends Figure {
    // Constructor
    public Triangle(int base, int height) {
        super(base, height);
    }

    // Implementing the area method
    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }
}
