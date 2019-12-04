package jPodgotovkaIzpit.Trip;
import java.util.Scanner;
/**
 * Created by SVETLO on 27-Nov-17.
 */
public class Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();

        String destination;
        String type;
        double money;

        if (season.equals("summer")) {
            type = "Camp";
        } else {
            type = "Hotel";
        }

            if (budget <= 100) {
                destination = " Bulgaria ";


                if (season.equals("summer")) {
                money = budget * 0.3;
            } else {
                money = budget * 0.7;
            }
        }  else  if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
            money = budget * 0.4;
        } else {
            money = budget * 0.8;
            }
        }else {
            destination = "Europe";
            type = "Hotel";
            money = budget * 0.9;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, money);
    }
}
