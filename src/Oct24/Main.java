package Oct24;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Oct24/hello.txt"))) {
            System.out.println("SUCCESS");
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("File error. Check the file.");
            System.err.println(e.getClass() + ": " + e.getMessage());
        }

        System.out.println("do things after");
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("whateveruwant.txt", false));
             FileWriter fw = new FileWriter("secondone.txt")) {
            // Will Still Run
            String s;
            while (!Objects.equals(s = sc.nextLine(), "STOP")) {
                bw.write(s);
                bw.newLine();
                fw.write(s);
                fw.write("\n");
            }
        } catch (IOException e) {
            System.out.println("File error. Check the file."); // Exception
            System.err.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
