package Aug29;

import java.util.Comparator;
public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
