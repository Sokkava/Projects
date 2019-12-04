import java.util.Scanner;

/**
 * Created by SVETLO on 07-Nov-17.
 */
public class Demo {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = n; i >= 1; i --) {
            System.out.println(i);
        }
    }
}
