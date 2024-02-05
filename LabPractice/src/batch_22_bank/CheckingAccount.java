package batch_22_bank;

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
    	 double TotalAmount= balance-amount;
    	 double Limit=TotalAmount-overdraftLimit;
        if (TotalAmount >= Limit) {
            balance -= amount;
        } else {
            System.out.println("Exceeding overdraft limit");
        }
    }
}


