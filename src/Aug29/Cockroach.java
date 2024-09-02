package Aug29;

import Aug22.Person;

public class Cockroach extends Animal {
    Person killer;


    public Cockroach(String name) {
        super(name);
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("zz zzzzz zzzz zzzz z z z z");
    }
}
