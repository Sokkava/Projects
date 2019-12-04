package DefiningClasses.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {




        HashMap<Integer, BankAccount2> accounts = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArgs = command.split("\\s+");
            String commandType = commandArgs[0];

            switch (commandType) {
                case "Create":
                    BankAccount2 account = new BankAccount2();
                    accounts.put(account.getId(), account);
                    System.out.printf("Account %s created%n", accounts);
                    break;

                case "Deposit":
                    accounts.get(Integer.valueOf(commandArgs[1])).
                            deposit(Integer.valueOf((commandArgs[2])));
                 break;

                case "SetInterest":
                    BankAccount2.setInterestRate(Double.valueOf(commandArgs[1]));
                    break;

                case "GetInterest":
                    System.out.println(accounts.get(Integer.valueOf(commandArgs[1]))
                            .getInterestRate(Integer.valueOf(commandArgs[2])));
                    break;

                    case "Print":

            }
            command = scanner.nextLine();

        }
    }

    }



