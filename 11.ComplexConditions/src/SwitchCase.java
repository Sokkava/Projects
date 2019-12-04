import java.util.Scanner;

/**
 * Created by SVETLO on 21-Oct-17.
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        switch (name)   {
            case "1" :
                System.out.println ("Monday") ;
            break;
            case "2" :

                 System.out.println("Tusday");
                 break ;
            case "3":
                System.out.println("Wendsday") ;
                break;
            case "4":
                    System.out.println("Tursday");
                    break;
            case"5" :
                System.out.println("Fraday");
                    break;


        }



    }
}
