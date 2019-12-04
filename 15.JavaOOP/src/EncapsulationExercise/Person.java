package EncapsulationExercise;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by SVETLO on 28-Dec-17.
 */
public class Person {

    private String name;
    private Double money;
    private List<Product> products;


        public Person(String name, double money) {
            this.name = name;
            this.money = money;
            this.products = new ArrayList<>();
        }

    public String getName() {
        return name;
    }
    public Iterable<T>getProducts() {
        }
        private void setName(String name) {
            if (name == null || name.trim().length() == 0 ) {
                throw new IllegalArgumentException(("Name cannot be empty");
            }
          this.name = name;
        }
            private void setMoney(double money) {

                if (money < 0)  {
                    throw new IllegalArgumentException("Money cannot be negative");

                }
                this.money = money;
            }

    public void boughtProduct(Product product) {





    }
}

      