import java.util.Scanner;
/**
 * Created by SVETLO on 07-Nov-17.
 */
public class Pet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 5; //Integer.parseInt(console.nextLine());
        for (int row = 0; row < n; row++) {
            System.out.println("$" + repeatStr("$", row));
        }
    }
    private static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
       for (int i = 0; i < count; i++)  {
           sb.append(str);
       }
       return sb.toString();

        }
    }
