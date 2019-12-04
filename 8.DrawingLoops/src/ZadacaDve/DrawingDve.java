package ZadacaDve;

import java.util.Scanner;

/**
 * Created by SVETLO on 24-Oct-17.
 */
public class DrawingDve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("$");

            for (int j = 0; j < n - 1; j++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}