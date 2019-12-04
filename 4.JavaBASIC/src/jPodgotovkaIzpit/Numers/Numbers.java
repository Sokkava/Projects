package jPodgotovkaIzpit.Numers;

import java.util.Scanner;

/**
 * Created by SVETLO on 27-Nov-17.
 */
public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 100000;  i <= 999999; i++) {

            int currentNumber = i;
            int product = 1;

            for (int j = 0; j <6; j++) {
                 int lastDigit = currentNumber % 10;
                product *= lastDigit;
                currentNumber /= 10;
            }

            if (product == n) {
                System.out.print(i + " ");
            }
        }
    }
}



