package Aug29;

public class Animal extends Object{
    String name;
    int age;

    public Animal(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.print(name + ": ");
    }

    @Override
    public String toString() {
        return name;
    }
}
