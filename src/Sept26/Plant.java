package Sept26;

public abstract class Plant {
    public static final int DEFAULT_HP = 10;
    Coord location;
    int sun_cost;
    private int hp;
    boolean is_aquatic;
    int cooldown;

    public Plant(int sun_cost, int hp, int cooldown) {
        this.sun_cost = sun_cost;
        this.cooldown = cooldown;
        this.hp = hp;
        is_aquatic = false;
    }

    public Plant(int sun_cost, int hp, boolean is_aquatic) {
        this.sun_cost = sun_cost;
        this.hp = hp;
        this.is_aquatic = is_aquatic;
    }

    void die() {
        hp = 0;
    }

    boolean is_dead() {
        return hp <= 0;
    }

    void take_damage(int dmg) {
        hp -= dmg;
    }

    public boolean same_coord(Plant p) {
        return p.location.col == this.location.col && p.location.row == this.location.row;
    }

    enum RangeType {
        LONG_RANGE, SHORT_RANGE, PROJECTILE
    }

    @Override
    public String toString() {
        return getClass().toString().substring(getClass().toString().indexOf(".")+1) + " (hp: " + hp + ") -> loc: " + location;}
}
