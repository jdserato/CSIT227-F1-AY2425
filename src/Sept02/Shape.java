package Sept02;

public abstract class Shape extends Object {
    public abstract double perimeter();
    public abstract double area();

    @Override
    public String toString() {
        return "A shape ";
    }
}
