package LiveDemo;

/**
 * Created by SVETLO on 23-May-17.
 */
import java.util.Scanner;

public class test {
    public static void main(String[] args)  {
           Scanner scan = new Scanner(System.in);
           double b1 = Double.parseDouble(scan.nextLine());
           double b2 = Double.parseDouble(scan.nextLine());
           double h = Double.parseDouble(scan.nextLine());
        System.out.println((b1 + b2) * h/2);

    }
}
