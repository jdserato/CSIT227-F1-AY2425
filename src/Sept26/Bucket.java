package Sept26;

public class Bucket extends Metal implements Shield{
    public Bucket() {
        super(40);
    }

    @Override
    public boolean isActive() {
        return hp > 0;
    }

    @Override
    public int takeDamage(int dmg) {
        return hp -= dmg;
    }

    @Override
    public int getHp() {
        return hp;
    }
}
