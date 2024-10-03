package Sept26;

public class SunShroom extends Mushroom implements SunProducer{
    Size size;

    public SunShroom() {
        super(25, DEFAULT_HP, 3);
        size = Size.SMALL;
    }

    public void grow() {
        size = Size.BIG;
    }

    public int generate_sun() {
        if (size == Size.SMALL) {
            return 15;
        }
        return 25;
    }

    enum Size {
        SMALL, BIG;
    }
}
