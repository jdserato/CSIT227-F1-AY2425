package Aug19;

import Aug22.Person;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student von = new Student(new Date());
//        von.setName("Von");
        von.setAnotherName("Andrie");
        System.out.println(von.getName());
//        System.out.print("Enter date (mm/dd/yyyy): ");
//        Scanner sc = new Scanner(System.in);
//        int mon = sc.nextInt();
//        int day = sc.nextInt();
//        int year = sc.nextInt();
//        System.out.println(mon + "/" +day + "/" + year);
//        int age = calculateAge(mon, day, year, 8, 19, 2024);
//        System.out.println("your age is " + age);
    }

    static int calculateAge(int mon, int day, int year, int curMon, int curDay, int curYear) {
        return curYear - year;
    }
}
