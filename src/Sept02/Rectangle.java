package Sept02;

public class Rectangle extends Shape{
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + "rectangle with length " + length + " and width " + width;
    }

    public static class Square extends Rectangle {

        public Square(double side) {
            super(side, side);
        }
    }
}
