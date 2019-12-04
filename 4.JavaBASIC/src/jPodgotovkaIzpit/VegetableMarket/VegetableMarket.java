package jPodgotovkaIzpit.VegetableMarket;

import java.util.Scanner;

/**
 * Created by SVETLO on 27-Nov-17.
 */
public class VegetableMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double vegetablePricePerKilo = Double.parseDouble(console.nextLine());
        double fruitPricePerKilo = Double.parseDouble(console.nextLine());
        int vegetableKilos = Integer.parseInt(console.nextLine());
        int fruitKilos = Integer.parseInt(console.nextLine());

        double result = (vegetablePricePerKilo * vegetableKilos) + (fruitPricePerKilo * fruitKilos);
        result /= 1.94;

        System.out.println(result);

    }
}
