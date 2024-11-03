package Midterm;

public class Peashooter implements Attacker{
    double income;

    @Override
    public String toString() {
        return "Peashooter";
    }

    @Override
    public int getDamage() {
        return 5;
    }

    public void setIncome(double income) {
        if (income < this.income) {
            return;
        }
        if (netIncome(income) < netIncome(this.income)) {
            return;
        }
        this.income = income;
    }

    private double netIncome(double income) {
        if (income <= 250000) {
            return income;
        }
        double tax;
        if (income <= 800000) {
            tax = (income - 250000) * .2;
            return income - tax;
        }
        if (income <= 2000000) {
            tax = 130000 + (income - 800000) * .3;
            return income - tax;
        }
        if (income <= 8000000) {
            tax = 490000 + (income - 2000000) * .32;
            return income - tax;
        }

        tax = 2410000 + (income - 8000000) * .35;
        return income - tax;
    }
}
