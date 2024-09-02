package Aug29;

import Aug22.Person;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Person assistant) {
        super(name);
        this.assistant = assistant;
    }

    @Override
    public void talk(){
        super.talk();
        System.out.println("meow meow meow meoww");
    }

    Person assistant;
}
