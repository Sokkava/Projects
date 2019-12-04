package jPodgotovkaIzpit;

import java.util.Scanner;

/**
 * Created by SVETLO on 14-Nov-17.
 */
public class Operations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1 = Integer.parseInt(console.nextLine());
        int n2 = Integer.parseInt(console.nextLine());
        String operator = console.nextLine();

        if (operator.equals("+")) {
        int result = n1 + n2;
        String oddEven = result % 2 == 0 ? "even" : "odd";

        System.out.printf("%d + %d = %d - %s", n1, n2, result, oddEven);
    } else if(operator.equals("-")) {
        int result = n1 + n2;
        String oddEven = result % 2 == 0 ? "even" : "odd";

        System.out.printf("%d + %d = %d - %s", n1, n2, result, oddEven);

    }else if(operator.equals("*")){
            int result = n1 * n2;
            String oddEven = result % 2 == 0 ? "even" : "odd";

        System.out.printf("%d * %d = %d - %s",n1,n2,result,oddEven);

     }else if (operator.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Connot divide %d by zero", n1);
            }

            double result = (double)n1 / n2;
            System.out.printf("%d / %d = %.2f", n1, n2, result);

        }else if (operator.equals ("%"))  {
        if (n2==0) {
            System.out.printf("Cannot divide %d by zero", n1);
        }else {
            int result = n1 % n2;
            System.out.printf("%d \\ %d = %d", n1, n2, result);
        }

        }
    }
}
