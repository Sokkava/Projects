package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();


        if ("Stamat".equals(a)) {
            String b = scanner.nextLine();

            if (b.length() > 3) {
                System.out.println(b.length());
            }
            if (b.length() < 3) {
                b = b + b;
                System.out.println(b.length());

            }
        }
    }
}