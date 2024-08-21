import java.util.Scanner;

class Main {
    public static void main(String[] a) { // psvm
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : array) {
            System.out.printf("%.2f ", (float) i);
        }
    }
}
