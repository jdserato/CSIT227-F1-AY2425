package Sept26;

public class Sunflower extends Plant implements SunProducer{
    public Sunflower() {
        super(50, DEFAULT_HP, 3);
    }

    public int generate_sun() {
        return 25;
    }
}
