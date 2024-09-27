package Sept26;

public class Peashooter extends Plant{
    int interval = 5;
    RangeType range = RangeType.LONG_RANGE;

    public Peashooter() {
        super(100, DEFAULT_HP);
    }

    int shoot() {
        return 1;
    }
}
