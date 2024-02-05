package batch_22_bank;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount(500, 200);

        savingsAccount.deposit(200);
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        checkingAccount.withdraw(300);
       System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
