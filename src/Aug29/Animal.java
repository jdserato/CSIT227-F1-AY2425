package Aug29;

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
}
