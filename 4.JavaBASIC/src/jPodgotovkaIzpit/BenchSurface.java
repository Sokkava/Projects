package jPodgotovkaIzpit;

import java.util.Scanner;

/**
 * Created by SVETLO on 09-Nov-17.
 */
public class BenchSurface {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int playgroundSide = Integer.parseInt(console.nextLine());

        double tileWidth = Double.parseDouble(console.nextLine());
        double tileLength = Double.parseDouble(console.nextLine());

        int benchWidth = Integer.parseInt(console.nextLine());
        int benchLentgh = Integer.parseInt(console.nextLine());

        int playgroundArea = playgroundSide * playgroundSide;

        int benchArea = benchWidth * benchLentgh;

        double tileAria = tileWidth * tileLength;

        double tilesNeeded = (playgroundArea - benchArea) / tileAria;
        double timeNeeded = tilesNeeded * 0.2;

        System.out.println(tilesNeeded);
        System.out.println(timeNeeded);

    }
}

