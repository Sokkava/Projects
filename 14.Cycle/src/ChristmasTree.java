import java.util.Scanner;
/**
 * Created by SVETLO on 07-Nov-17.
 */
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n + 1; i++) {
            String spaces = repeatStr(" ", n + i);
            String stars = repeatStr("*", n);

            System.out.println(spaces + stars + "|" + stars + spaces);
        }


    static String repeatStr(String str, int count) {

        return str;
    }
}