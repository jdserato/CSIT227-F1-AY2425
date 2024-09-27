package Sept26;

public class Mushroom extends Plant {

    public Mushroom(int sun_cost, int hp) {
        super(sun_cost, true, hp);
    }

    public void wake_up(CoffeeBean cb) {
        is_asleep = false;
        cb.die();
    }
}
