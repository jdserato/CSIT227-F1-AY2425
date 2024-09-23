package Aug29;

import java.util.Comparator;
public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.age < o2.age) {
            return -1;
        } else if (o1.age == o2.age) {
            return 0;
        }
        return 1;
    }
}
