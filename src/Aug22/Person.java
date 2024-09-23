package Aug22;

import Aug29.Pest;

import java.util.Date;

public class Person implements Pest {
    final static String SPECIES = "Homo Sapiens";
    static int number_of_persons = 0;
    private String name, occupation, relationship_status;
    private int age;
    float height, weight;
    char gender;
    final Date birthday;

    public Person(Date birthday) {
        this.birthday = birthday;
        System.out.println("new person just dropped");
        number_of_persons++;
    }

    public Person(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public Person(String relationship_status, Date birthday) {
        this.birthday = birthday;
        this.relationship_status = relationship_status;
    }



    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat()
    {

    }
    void sleep() {

    }

    void walk() {

    }

    void walk(int distance) {

    }
    // METHOD OVERLOADING
    void walk(float distance) {

    }

    @Override
    public void transmitVirus() {
        System.out.println("climate change++");
    }
}

