package Encapsulation;

/**
 * Created by SVETLO on 27-Dec-17.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person (String firstName, String lastName, Integer age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() { return this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return this.age; }
    public Double getSalary()  {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.getFirstName()+ " " + this.getLastName() + " get" + this.getSalary() + "leva";
    }
public void increaseSalary (Double bonus) {
        if (this.getAge() < 30) {
            this.salary +=  this.salary * (bonus / 200);
        } else {
            this.salary += this.salary * bonus/100;
        }
    }
}