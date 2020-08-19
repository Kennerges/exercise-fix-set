package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        for (char course = 'A'; course <= 'C'; course++) {
            System.out.print("How many students for course " + course + "? ");
            int count = sc.nextInt();
            for (int i = 1; i <= count; i++) {
                int code = sc.nextInt();
                set.add(code);
            }
        }

        System.out.println("Total students: " + set.size());
        sc.close();
    }

}
