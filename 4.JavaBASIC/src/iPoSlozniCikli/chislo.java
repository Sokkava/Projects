package iPoSlozniCikli;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by SVETLO on 08-Nov-17.
 */
public class chislo {
    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (col > 1) {
                    System.out.print(" ");
                }
                System.out.print(num);
                num++;
                if (num > n) {
                    break;
                }
            }
                System.out.println();
                if (num > n) {
                    break;
                }
            }
        }
    }

























