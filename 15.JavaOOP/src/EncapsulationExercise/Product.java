package EncapsulationExercise;

/**
 * Created by SVETLO on 28-Dec-17.
 */
public class Product {

    private String name;
    private Double price;
}
    public String getName() {
        return this.name;

    }
    private void setName(String name)  {
        if (name ==null || name.trim().length() == 0 )  {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

         public void boughtProduct(Product product) {
    if (this.money - product.getPrice() < 0 );

}





