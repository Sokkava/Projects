package iPoSlozniCikli;

import java.util.Scanner;

/**
 * Created by SVETLO on 08-Nov-17.
 */
public class NOD {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        while (b != 0) {
            int oldB = b;
            b = a & b;
            a = oldB;
        }

        System.out.println(a);


    }
}



