package Aug19;

import Aug22.Person;

import java.util.Date;

public class Student extends Person {
    public Student(Date birthday) {
        super(birthday);
    }

    void setAnotherName(String name) {
        setName(name);
    }
}
