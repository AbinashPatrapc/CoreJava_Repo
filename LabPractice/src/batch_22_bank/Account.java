package batch_22_bank;

abstract class Account {
    protected double balance;//1000

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}



