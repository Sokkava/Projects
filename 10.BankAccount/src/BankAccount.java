/**
 * Created by SVETLO on 04-Oct-17.
 */
public class BankAccount {
    public static void main(String[] args) {
    }
        private int id;
        private double balance;



    public void setId(int ids) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {

        if (amount > this.balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Id" + this.id;
    }
}
















