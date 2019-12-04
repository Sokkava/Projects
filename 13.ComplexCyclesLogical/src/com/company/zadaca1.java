package com.company;

import java.util.Scanner;

/**
 * Created by SVETLO on 18-Oct-17.
 */
public class zadaca1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);

        if ('f' == gender) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr");
            }
        }
    }
}


