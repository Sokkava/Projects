import java.util.Scanner;

/**
 * Created by SVETLO on 20-Oct-17.
 */
public class triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());


        boolean isXInside = x1 <= x && x2 >= x;
        boolean isYInside = y1 <= y && y2 >= y;

        if ((x1 <= x && x2 >= x && y1 <= y && y2 >= y) ||
                (x1 <= x && x2>= x && y1 <= y && y2 <= y)   ||
                (x1 <= x && x2 >= x && y1 <= y || y2 >= y) &&
                        (x1 <= x && x2 >= x && y1 <= y && y2 >= y)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}

