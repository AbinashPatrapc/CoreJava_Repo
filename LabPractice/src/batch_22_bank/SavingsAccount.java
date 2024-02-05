package batch_22_bank;

class SavingsAccount extends Account {
    private double interestRate;//5

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);//super(1000);
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void addInterest() {
        balance += balance * (interestRate / 100);
        // balance=balance+balance*(iR/100);
                  // 1200   + 1200*(5/100);
                  // 1200   + 1200*0.05;
    }
}

