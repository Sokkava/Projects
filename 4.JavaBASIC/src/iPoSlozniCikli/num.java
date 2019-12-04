package iPoSlozniCikli;

import java.util.Scanner;

/**
 * Created by SVETLO on 08-Nov-17.
 */
public class num {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        while (num < 1  || num >100) {
            System.out.println("invalid number");
            num = Integer.parseInt(console.nextLine());
        }
        System.out.println("the number is "  +  num);
        }
}
