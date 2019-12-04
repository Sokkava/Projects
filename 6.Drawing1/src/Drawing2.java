import java.util.Scanner;

/**
 * Created by SVETLO on 28-Oct-17.
 */
public class Drawing2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = Integer.parseInt(scanner.next());

        System.out.print("+");

              for (int i = 0; i < n-2; i++)  {
                  System.out.print(" -");
                  System.out.println();
        }
        System.out.print(" +");
        for (int j = 0; j < n-2; j++)  {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}