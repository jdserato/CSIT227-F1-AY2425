package Aug29;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void talk();

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            if (age == (int) obj) {
                return true;
            }
        }
        if (obj instanceof String) {
            if (name.equals(obj)) {
                return true;
            }
        }
        if (obj instanceof Animal) {
            if (Objects.equals(name, ((Animal) obj).name)
                    && getClass() == obj.getClass()) {
                return true;
            }
        }
        return super.equals(obj);
    }
}
