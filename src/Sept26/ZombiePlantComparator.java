package Sept26;

import java.util.Comparator;

public class ZombiePlantComparator implements Comparator<Zombie> {
    Plant p;

    public ZombiePlantComparator(Plant p) {
        this.p = p;
    }

    @Override
    public int compare(Zombie o1, Zombie o2) {
        return Double.compare(p.location.distance(o1.location), p.location.distance(o2.location));
    }
}
