package Sept26;

public class Coord {
    int row;
    double col;

    public Coord(int row, double col) {
        this.row = row;
        this.col = col;
    }

    public Coord(int row) {
        this.row = row;
        col = 9;
    }

    @Override
    public String toString() {
        return String.format("row: %d, col: %.2f", row, col);
    }

    public double distance(Coord o) {
        return Math.sqrt(Math.pow(o.row - this.row, 2) + Math.pow(o.col - this.col, 2));
    }
}
