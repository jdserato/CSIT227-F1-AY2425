package Aug29;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny");
        browny.talk();
        Cat mingkay = new Cat("Mingkay");
        mingkay.talk();
        Cockroach joey = new Cockroach("Joey");
        joey.talk();
        System.out.println(browny.toString());
        System.out.println(joey.toString());
    }
}
