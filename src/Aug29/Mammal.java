package Aug29;

public abstract class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name,age);
    }

    protected void breastfeed() {
        System.out.println(name + " provides milk");
    }
}
