package jPodgotovkaIzpit.ButterFly;

import java.util.Scanner;

/**
 * Created by SVETLO on 28-Nov-17.
 */
public class ButterFly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n - 2; i++) {
            String starOrDash = i % 2 == 0 ? "-" : "*";
            String wings = repeatStr(starOrDash, n - 2);

            System.out.printf("%s\\ /%s%n", wings, wings);
        }
        System.out.println(repeatStr(" ",  n - 1) + "@");


        for (int i = 1; i <= n - 2; i++) {
            String starOrDash = i % 2 == 0 ? "-" : "*";
            String wings = repeatStr(starOrDash, n - 2);
            
            System.out.printf("%s/ \\%s%n", wings, wings);
        }
    }
    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}





