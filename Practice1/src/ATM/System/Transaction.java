package ATM.System;

import java.util.Date;

public class Transaction {
    private String transactionType;
    private double amount;
    private Date timestamp;

    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = new Date(); 
    }
    public String getTransactionType() {
		return transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	@Override
	public String toString() {
		return "Transaction [transactionType=" + transactionType + ", amount=" + amount + ", timestamp=" + timestamp
				+ "]";
	}
    
}
