package Oct17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int[] arr = {0,1,2,3,4,5};
        while (true) {
            System.out.print("Enter a numerator and a denominator : ");
            Integer num = null, den;
            try {
                num = sc.nextInt();
                ensurePositive(num);
                den = sc.nextInt();
                ensurePositive(den);
                System.out.println("Quotient is " + (arr[num] / arr[den]));
                return;
            } catch (Exception e) {
            }
//            System.out.println("YEY");
        }
    }

    private static void ensurePositive(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException(num + " is not positive");
        }
//        ensurePositive(num);
    }
}