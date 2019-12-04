package DefiningClassesExercise.RawData.companyRoaster;

/**
 * Created by SVETLO on 19-Dec-17.
 */
public class Person {
    private final static int DEFAULT_AGE = -1;

    private String name;
    private int age;

    public Person(String name, int age)  {
        }
    public Person(int age) {
        this.age = age;
        this.name = name;
    }

       public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Person(String name) {
        this.name = name;


    }
}
