package Aug29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(100));
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Collections.sort(numbers);
        System.out.println();
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Animal vince = new Cat("Jay", 7);
        List<Animal> animals = new ArrayList<>();
        System.out.println();
        animals.add(new Person("Vince", 18));
        animals.add(new Dog("Browny", 5));
        animals.add(new Cat("Mingkay", 18));
        animals.add(new Cockroach("Joey", "", 7));
        animals.add(new Whale("Vince", 4));
        animals.add(new Platypus("Perry", 10));
        animals.add(new Fish("Vince", 1));
        animals.add(new Bird("Phoenix", 18));
        animals.add(new Penguin("Happy", 18));
        Collections.sort(animals);
        for (Animal a : animals) {
            System.out.print(a.toString() + ": ");
            a.talk();
        }
        animals.sort(new AnimalAgeComparator());
        for (Animal a : animals) {
            System.out.println(a);
        }
        System.out.println("SORT BY VINCE, 7");
        animals.sort(new AnimalWithAgeComparator(vince));
        for (Animal a : animals) {
            System.out.println(a);
        }
        System.out.println("ONLY PRINT VINCEs");
        Animal second = new Person("Vince", 18);
        for (Animal a : animals) {
            if (a.equals(18)) {
                System.out.println(a);
            }
        }
    }
}
