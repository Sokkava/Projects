package DefiningClasses.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();
        System.out.println(dice.getRollFreq()[0]);



        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[]commandArgs = command.split("\\s+");
            String commandType = commandArgs[0];

            switch (commandType) {
                case "Create":
                    executeCreateCommand(accounts, commandArgs[1]);
                     break;
                case "Deposit":
                    executeDepositCommand(accounts, commandArgs);
                     break;
                case "WithDraw":
                     executeWithDrawCommand(accounts, commandArgs);
                case "Print":
                     executePrintCommand(accounts, commandArgs);
                      break;
            }
                    command = scanner.nextLine();
            }
        }

    private static void executePrintCommand(HashMap<Integer, BankAccount> accounts, String[] commandArgs) {
        Integer id = Integer.valueOf (commandArgs [1]);
        if (!accounts.containsKey(id)) {
            System.out.println("account does not exists ");
            return;
        }
        BankAccount account = accounts.get(id);
        System.out.printf("account %s, balance:,%2f%n", account, account.getBalance());
    }
    private static void executeWithDrawCommand(HashMap<Integer, BankAccount> accounts, String []commandArgs) {       
        Integer id = Integer.valueOf (commandArgs [1]);
        Double amount = Double.valueOf(commandArgs [2]);
        if (!accounts.containsKey(id)){
            System.out.println("account does not exists ");
            if (accounts.containsKey(id))  {
                System.out.println("The account does not exists");
            }
        }
        try {
            accounts.get(id).withdraw(amount);

        }catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            return;
        }
    }

    private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String [] commandArgs) {
        Integer id = Integer.valueOf (commandArgs [1]);
        Double amount = Double.valueOf(commandArgs [2]);

        if (!accounts.containsKey(id)){
            System.out.println("account does not exists ");

            if (accounts.containsKey(id))  {
                System.out.println("The account does not exists");
            }
        }
        try {
            accounts.get(id).deposit(amount);

        }catch (IllegalArgumentException ise) {
            System.out.println(ise.getMessage());
            return;
        }
    }
    private static void executeCreateCommand(HashMap<Integer, BankAccount> accounts, String commandArg) {
        int id = Integer.valueOf(commandArg);
        if (accounts.containsKey(id)) {

            System.out.println("Account already exists!%n");
        } else {
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }
    }
}
