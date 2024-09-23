package Aug29;

public class Bird extends Animal implements EggLayer{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("tweet");
    }

    @Override
    public int layEggs() {
        return 4;
    }

}
