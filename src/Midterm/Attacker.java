package Midterm;

public interface Attacker {
    int getDamage();

    default int attack() {
        System.out.println(this + " attacks");
        return getDamage();
    }
}
