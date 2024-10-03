package Sept26;

public class Peashooter extends Plant{
    int interval = 5;
    RangeType range = RangeType.LONG_RANGE;

    public Peashooter() {
        super(100, DEFAULT_HP, 2);
    }

    int shoot() {
        return 2;
    }
}
