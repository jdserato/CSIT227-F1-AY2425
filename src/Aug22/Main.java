package Aug22;

import java.util.Date;

public class Main {
    int i;
    public static void main(String[] args) {
        char ch = 'j';
        System.out.println(Character.toUpperCase(ch));

        Person vince = new Person("Complicated", new Date(2010, 04, 13));
        Person jay = vince;
        vince.setName("Vince");
//        jay.name = "JAY";
        System.out.println(vince.getName());
        System.out.println(jay.getName());
        Person someone = new Person(new Date(2000, 07, 13), "Someone");
//        Person.species = "Homo Sapiens Sapiens";
//        System.out.println(Person.species);

        System.out.println(Person.number_of_persons);
    }

    private static void hello() {
        System.out.println("HELLO");
    }
}
