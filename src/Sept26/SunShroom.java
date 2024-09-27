package Sept26;

public class SunShroom extends Mushroom{
    Size size;

    public SunShroom() {
        super(25, DEFAULT_HP);
        size = Size.SMALL;
    }

    public void grow() {
        size = Size.BIG;
    }

    int generate_sun() {
        if (size == Size.SMALL) {
            return 15;
        }
        return 25;
    }

    enum Size {
        SMALL, BIG;
    }
}
