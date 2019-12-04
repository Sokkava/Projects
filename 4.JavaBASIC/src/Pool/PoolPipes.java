package Pool;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by SVETLO on 27-Nov-17.
 */
public class PoolPipes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int poolVolume = Integer.parseInt(console.nextLine());
        int pipe1 = Integer.parseInt(console.nextLine());
        int pipe2 = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());

        double pipe1Total = pipe1 * hours;
        double pipe2Total = pipe1 * hours;
        double total = pipe1Total + pipe2Total;


        if (total <= poolVolume) {
            int percentFull = (int) (total / poolVolume * 100);
            int pipe1Percent = (int) (pipe1Total / total * 100);
            int pipe2Percent = (int) (pipe2Total / total * 100);

        System.out.printf(" The pool is %d%% full.Pipe 1 : %d%%.Pipe 2: %d%%.",
                percentFull, pipe1Percent, pipe2Percent);
        } else {
            System.out.printf("For %f hours the pool is overflow with %d liters.",
                    (hours),(total - poolVolume));
        }
    }
}





