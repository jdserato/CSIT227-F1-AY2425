package Aug29;

public class Fish extends Animal implements Swimmer{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("blooob blooob");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims using fins");
    }
}
