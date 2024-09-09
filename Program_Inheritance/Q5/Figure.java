public abstract class Figure {
    protected int dimension1;
    protected int dimension2;

    // Constructor
    public Figure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method
    public abstract double area();
}
