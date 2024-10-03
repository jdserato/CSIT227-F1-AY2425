package Sept26;

public class Mushroom extends Plant {

    boolean is_asleep;
    public Mushroom(int sun_cost, int hp, int cooldown) {
        super(sun_cost, hp, cooldown);
        is_asleep = true;
    }

    public void wake_up(CoffeeBean cb) {
        is_asleep = false;
        cb.die();
    }

    @Override
    public String toString() {
        return super.toString() + "asleep? " + is_asleep;
    }
}
