import java.util.Scanner;

/**
 * Created by SVETLO on 07-Nov-17.
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());


        while (num<1 || num >100)  {

            System.out.println("Invalid number.");
            num = Integer.parseInt(console.nextLine());

            System.out.println("the integer is");
        }
    }
}
