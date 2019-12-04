package DrwaingEdno.DrawingTri;

import java.util.Scanner;

/**
 * Created by SVETLO on 24-Oct-17.
 */
public class Tri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // first row
        String firstAndLastRow = "+";
        // System.out.print("+" );
        for (int i = 0; i < n - 2; i++) {
            //      System.out.print(" -")
            firstAndLastRow = firstAndLastRow + " -";
        }
        firstAndLastRow += " +";
        System.out.println(firstAndLastRow);

        //midle part
        String mPart = "|";
        for (int i = 0; i < n - 2; i++) {
            mPart = mPart + " -";
        }
        mPart += " |";
        for (int i = 0; i < n - 2; i++) {
            System.out.println(mPart);
            System.out.println(firstAndLastRow);
        }
    }

}

             //   System.out.print(" +");
           //     System.out.println();
         //last row
           //     System.out.print("+");
           // for (int i = 0; i < n-2; i++)  {


                //      System.out.print(" -");

       // System.out.print(" +");
      //  System.out.println();
  //  }
// }
