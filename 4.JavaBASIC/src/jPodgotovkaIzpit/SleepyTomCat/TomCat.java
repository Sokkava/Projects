package jPodgotovkaIzpit.SleepyTomCat;
import java.util.Scanner;
/**
 * Created by SVETLO on 14-Nov-17.
 */
public class TomCat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int holidays = Integer.parseInt(console.nextLine());
        int workDays = 365 - holidays;

        int playTime = holidays * 127 + workDays +63;
        int difference = Math.abs(30000 - playTime);
        int hours = difference / 60;
        int minutes = difference % 60;

        if (playTime<30000) {
            System.out.println("Tom sleeps well");
            System.out.printf(" %d hours and %d minutes less for play", hours, minutes);
        }else {
            System.out.println("Tom will run away");
            System.out.printf(" %d hours and %d minutes more for play", hours, minutes);
        }
    }
}
