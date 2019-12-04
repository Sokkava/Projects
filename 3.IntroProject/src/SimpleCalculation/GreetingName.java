package SimpleCalculation;

/**
 * Created by SVETLO on 26-May-17.
 */

import java.util.Scanner;

public class GreetingName  {

   public static void main( String []args ) {
       Scanner console = new Scanner (System.in);

       String name = console.nextLine();
       System.out.printf("Hello, %s!", name);
       }
   }
