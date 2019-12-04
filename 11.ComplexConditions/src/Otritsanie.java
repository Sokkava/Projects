import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by SVETLO on 20-Oct-17.
 */
public class Otritsanie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isValid = number >= 100 && number <= 200 || number == 0;

        if (!isValid ) {

            System.out.println("invalid");

        }
    }
}
