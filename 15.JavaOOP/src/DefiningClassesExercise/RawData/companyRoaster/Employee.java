package DefiningClassesExercise.RawData.companyRoaster;

/**
 * Created by SVETLO on 19-Dec-17.
 */
public class Employee extends Person {
    private final static String DEFAULT_EMAIL = "n/a";

    private double salary;
    private String position;
    private String departement;
    private String email;

    public Employee(String name, double salary, String position, String departement, String email, int age) {
        super(name, age);
        this.salary = salary;
        this.position = position;
        this.departement = departement;
        this.email = DEFAULT_EMAIL;

    }

    public Employee(String name, double salary, String position, String departement) {
        super(name);
        this.salary = salary;
        this.position = position;
        this.departement = departement;
        this.email = DEFAULT_EMAIL;

    }

    public Employee(String name, double salary, String position, String departement, int age) {
        super(name, age);
        this.salary = salary;
        this.position = position;
        this.departement = departement;
        this.email = DEFAULT_EMAIL;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", super.getName(), this.getSalary(), this.email, super.getAge());
    }
}