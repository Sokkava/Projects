import java.util.Scanner;

/**
 * Created by SVETLO on 07-Nov-17.
 */
public class Demo4 {

    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int k = 1;
        while (k <=n) {
            System.out.println(k);
            k= 2*k+1;

        }
    }
}
