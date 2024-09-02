package Aug29;

import Aug22.Person;

public class Dog extends Animal {
    Person owner;

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("aw aw");
    }
}
