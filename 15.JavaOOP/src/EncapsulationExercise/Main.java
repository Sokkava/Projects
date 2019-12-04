package EncapsulationExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SVETLO on 28-Dec-17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
     /*
        Pesho=11;Gosho=4
        Bread=10;Milk=2;
        Pesho Bread
        Gosho Milk
        Gosho Milk
        Pesho Milk
        END
*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        try {
            String[] somePeoples = reader.readLine().split(";");
            for (String somePeople : somePeoples) {
                String[] tokens = somePeople.split("=");
                String name = tokens[0];
                double money = Double.parseDouble(tokens[1]);
                Person person = new Person(name, money);
                persons.putIfAbsent(person.getName(), person);
            }

            String[] someProducts = reader.readLine().split(";");
            for (String someProduct : someProducts) {
                String[] tokens = someProduct.split("=");
                String name = tokens[0];
                double money = Double.parseDouble(tokens[1]);
                Product product = new Person(name, money);
                products.putIfAbsent(product.getName(), product);
            }

            String command = " ";

            while (!"END".equals((command = reader.readLine())))  {

                String [] commands = command.split("\\s+");
                persons.get(commands[0]).boughtProduct(products.get(commands[1]));
            }

        } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            if (persons.size() !=0 && products.size() !-0) {
            persons.entrySet().stream().forEach(p -> {
                List<String> productsName =new ArrayList<>();
                p.getValue().getProducts().forEach((pr -> )
            }
        }


        }

    }
