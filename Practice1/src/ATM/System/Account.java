package ATM.System;

public class Account implements ATM {
	private long accountNumber;
	private double balance;
	private String accountType;
	private Customer customer;
	
	public Account(long accountNumber, double balance, String accountType,Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.customer=customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	@Override
	public String deposit(double amount)throws InvalidAmountException {
		if (amount == 0 || amount < 0) {
			throw new InvalidAmountException("Error:Enter a Valid Amount");
		} else {
			balance += amount;
		}
		return amount + " Deposited Successfully";
	}

	@Override
	public String withdraw(double amount) throws InsufficientAmountException {
			if (amount > balance) {
				throw new InsufficientAmountException("Error:You dont have sufficient amount to Withdraw");
			} else {
				balance -= amount;
			}
		return amount + " Withdrawn Successfully";
	}

	@Override
	public double checkBalance() {
		return getBalance();
	}

}
