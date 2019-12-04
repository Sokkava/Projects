import org.omg.CORBA.Object;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by SVETLO on 04-Oct-17.
 */

public class Main {



    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setId(1);
        account.getBalance();

        System.out.println(account);

    }
}
