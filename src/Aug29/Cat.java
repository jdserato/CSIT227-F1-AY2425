package Aug29;

import Aug22.Person;

public class Cat extends Mammal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, Person assistant) {
        super(name, age);
        this.assistant = assistant;
    }

    @Override
    public void talk(){
        System.out.println("meow meow meow meoww");
    }

    Person assistant;
}
