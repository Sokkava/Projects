package DefiningClassesExercise.RawData.CarSell;

import java.util.List;

/**
 * Created by SVETLO on 06-Dec-17.
 */
public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {

        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires= tires;

    }

    public String getModel() {
        return model;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }
}
