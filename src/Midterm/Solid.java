package Midterm;

public abstract class Solid implements Comparable<Solid> {
    abstract double surfaceArea();
    abstract double volume();

    @Override
    public int compareTo(Solid o) {
        int res = Double.compare(volume(), o.volume());
        if (res == 0) {
            return Double.compare(surfaceArea(), o.surfaceArea());
        }
        return res;
    }
}
