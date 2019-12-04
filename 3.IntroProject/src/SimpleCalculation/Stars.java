package SimpleCalculation;

/**
 * Created by SVETLO on 30-May-17.
 */
public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(generateStars(i));
        }
    }

    public static String generateStars(int numberofStars) {
        String result = "";
        for (int i = 0; i < numberofStars; i++) {
            result = result + "*";
        }

    return result;
    }
}
