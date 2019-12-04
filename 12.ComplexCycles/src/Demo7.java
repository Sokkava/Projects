import java.util.Scanner;

/**
 * Created by SVETLO on 07-Nov-17.
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int result = 1;
//        do  {
//            result = result *n;            n--;
//
//        }while (n>1);

        for (int i=1; i <=n; i++) {
            result *=i;
        }
        System.out.println(result);

    }
}
