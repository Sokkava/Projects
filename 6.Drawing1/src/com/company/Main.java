package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<n; i++) {
            System.out.print("$");
                for (int j = 0; j<i; j++) {
                    System.out.print("$");

            }
            System.out.println();
        }
    }
}
