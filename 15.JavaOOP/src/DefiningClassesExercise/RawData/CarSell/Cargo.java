package DefiningClassesExercise.RawData.CarSell;

/**
 * Created by SVETLO on 06-Dec-17.
 */
public class Cargo {

    private String type;
    private int weight;

    public Cargo ( String type, int weight)  {
        this.type = type;
        this.weight = weight;

    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }


}
