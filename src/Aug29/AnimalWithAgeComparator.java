package Aug29;

import java.util.Comparator;

public class AnimalWithAgeComparator implements Comparator<Animal> {
    Animal a;

    public AnimalWithAgeComparator(Animal vince) {
        a = vince;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        int diff1 = Math.abs(o1.age - a.age);
        int diff2 = Math.abs(o2.age - a.age);
        if (diff2 != diff1) {
            return Integer.compare(diff1, diff2);
        }
        if (o1.age < o2.age) {
            return -1;
        }
        return 1;
    }
}
