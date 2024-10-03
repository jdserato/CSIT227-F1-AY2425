package Sept26;

public class Zombie {
    public static final int DEFAULT_HP = 10;
    int hp;
    double speed;
    int damage = 1;
    Coord location;
    Shield s;

    public Zombie() {
        hp = DEFAULT_HP;
        speed = 0.3;
    }

    public Zombie(int hp, float speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }
    boolean is_dead() {
        return hp <= 0;
    }

    void take_damage(int dmg) {
        if (s != null && s.isActive()) {
            s.takeDamage(dmg);
        } else {
            hp -= dmg;
        }
    }

    void eat(Plant p) {
        p.take_damage(damage);
    }

    void walk() {
        location.col -= speed;
    }

    @Override
    public String toString() {
        return getClass().toString().substring(getClass().toString().indexOf(".")+1) + " (hp: " + hp + (s != null ? "+ " + s.getHp() :"")+") -> loc: " + location;
    }

    public boolean reachesHouse() {
        return location.col <= 0;
    }
}
