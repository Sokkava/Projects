package DefiningClassesExercise.RawData.CarSell;

/**
 * Created by SVETLO on 06-Dec-17.
 */
public class Tire {

    private int age;
    private double pressure;

    public Tire(int age, double pressure) {
        this.age = age;
        this.pressure = pressure;

    }

    public double getPressure() {
        return pressure;
    }
}

