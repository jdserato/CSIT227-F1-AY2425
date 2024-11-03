package Aug29;

public class Cockroach extends Animal {
     Person killer;

    public Cockroach(String name, String virus, int age) {
        super(name, age);
    }

    public Person getKiller() {
        return killer;
    }

    public void setKiller(Aug29.Person p) {
//        killer = p;
    }

    //    @Override
    public void talk() {
        System.out.println("zz zzzzz zzzz zzzz z z z z");
    }

}
