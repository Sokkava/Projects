import java.util.Scanner;

/**
 * Created by SVETLO on 07-Nov-17.
 */
public class Demo2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int num = 1;
        for (int i = 0; i<=n; i++) {
            System.out.println(num);

            num *= 2;
        }

    }
}


