package Aug29;

import Aug22.Person;

public class Dog extends Mammal {
    Person owner;

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void talk() {
        System.out.println("aw aw");
    }
}
