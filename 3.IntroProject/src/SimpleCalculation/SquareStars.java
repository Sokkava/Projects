package SimpleCalculation;

import java.util.Scanner;

public class SquareStars {

    public static void main(String[] args) {
        //Read input
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        // print top part of the rect.
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();

        //print the siddle part
        for (int i = 0; i < a - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < a - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

            //print bottom part of the rect.
            for (int e = 0; e < a; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


