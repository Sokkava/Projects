package Encapsulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by SVETLO on 28-Dec-17.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> persons;
        Double bonus;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());

            persons = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] input = reader.readLine().split(" ");
                persons.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            }

            bonus = Double.parseDouble(reader.readLine());
        }
        for (Person person : persons )  {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

}
