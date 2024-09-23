package Aug29;

public class Person extends Mammal implements Swimmer{
    public Person(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("hi");
    }

    public void swim () {
        System.out.println(name + " swims using hands");
    }

}
