package DefiningClassesExercise.RawData.companyRoaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by SVETLO on 19-Dec-17.
 */
public class Main {

    public Main() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Map<String, List<Employee>> employeeMap = new HashMap<>();


                while (n-- > 0) {

            String[] tokens = reader.readLine().split("\\s+");
            Employee employee = null;
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            employeeMap.putIfAbsent(department, new ArrayList<>(1));

            switch (tokens.length) {

                case 6:
                    String email = tokens[4];
                    int age = Integer.parseInt(tokens[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;

                case 5:
                    try {
                        int newAge = Integer.parseInt(tokens[4]);
                        employee = new Employee(name, salary, position, department, newAge);
                    } catch (NumberFormatException e) {
                        String currEmail = tokens[4];
                        employee = new Employee(name, salary, position, department, currEmail);
                    }
                    break;
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
            }
            employeeMap.get(department).add(employee);
            }

        employeeMap.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(
                e2.getValue().stream().mapTopDouble(Employee::getSalary).average().getAsDouble(),
                e1.getValue().stream().mapTopDouble(Employee::getSalary).average().getAsDouble()))
        .limit(1)
        .forEach(e -> {
            System.out.println(String.format("Highest Average Salary: %s %s", e.getKey()));
            e.getValue().stream()
                    .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                    .collect(Collectors.toList()).forEach(System.out::println);
            ));

        }

}
