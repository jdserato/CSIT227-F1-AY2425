package Aug29;

public class Penguin extends Bird implements Swimmer{
    public Penguin(String name, int age) {
        super(name, age);
    }
    @Override
    public void swim() {
        System.out.println(name + " swims by flapping");
        return;
    }
}
