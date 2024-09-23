package Aug29;

public class Whale extends Mammal implements Swimmer{
    public Whale(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("wwwwwwwwwwwwwwwwwwwwww");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims but resurface for air");
    }
}
