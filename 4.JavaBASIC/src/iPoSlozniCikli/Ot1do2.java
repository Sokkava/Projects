package iPoSlozniCikli;

import java.util.Scanner;

/**
 * Created by SVETLO on 08-Nov-17.
 */
public class Ot1do2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num =1;
        for (int i=0; i<=n; i+=2) {
        System.out.println(i);
        num *=4;

    }
  }
}