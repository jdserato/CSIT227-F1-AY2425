package Sept26;

public class BucketheadZombie extends Zombie implements HasMetallic{
    Bucket bucket;

    public BucketheadZombie() {
        bucket = new Bucket();
        s = bucket;
    }

    @Override
    public boolean isActive() {
        return bucket.isActive();
    }

    @Override
    public void takeMetal() {
        bucket.hp = 0;
    }
}
