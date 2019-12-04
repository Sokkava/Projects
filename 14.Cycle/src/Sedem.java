import java.util.Scanner;
/**
 * Created by SVETLO on 24-Oct-17.
 */
public class Sedem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int readCount = 2* n;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;

        }

        if (leftSum !=rightSum) {

        System.out.printf("No, diff = %d", Math.max(leftSum, rightSum) - Math.min(leftSum, rightSum));

        }  else {
        System.out.printf( "yes, sum = " + leftSum);

        }

    }
    }

