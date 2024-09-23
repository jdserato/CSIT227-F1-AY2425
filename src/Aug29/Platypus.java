package Aug29;

public class Platypus extends Mammal implements Swimmer, EggLayer{
    public Platypus(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("kkkkKKKKKKKKKKkkkkkkkkkkkKKKK");
    }

    @Override
    public int layEggs() {
        return 1;
    }

    @Override
    public void swim() {
        System.out.println(name + " swims as a submarine");

    }
}
