package DefiningClasses.bank;

public class BankAccount2 {
    private static final double DEFAULT_INTEREST_RATE = 0.02;

    private static int accountsCount;
    private static double currentInterestRate = DEFAULT_INTEREST_RATE;

    private int id;
    private double balance;

    public BankAccount2() {
      this.id =  ++ accountsCount;
      currentInterestRate = DEFAULT_INTEREST_RATE;

    }
    public int getId() {
        return this.id;
    }

        public static void setInterestRate(double interestRate) {
            currentInterestRate = interestRate;
    }
    public void deposit(double amount) {
        this.balance +=amount;
    }
    public double getInterestRate(int years) {
        return this.balance * currentInterestRate * years;
    }
    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
