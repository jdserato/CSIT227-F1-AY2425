package Aug29;

import Aug22.Person;

public class Cockroach extends Animal implements Pest {
    Person killer;

    public Cockroach(String name, String virus, int age) {
        super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("zz zzzzz zzzz zzzz z z z z");
    }
}
