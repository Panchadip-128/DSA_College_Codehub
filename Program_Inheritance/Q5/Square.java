public class Square extends Figure {
    // Constructor
    public Square(int side) {
        super(side, side);
    }

    // Implementing the area method
    @Override
    public double area() {
        return dimension1 * dimension1;
    }
}
