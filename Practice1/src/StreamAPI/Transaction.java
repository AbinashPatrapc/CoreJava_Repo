package StreamAPI;

import java.util.Date;

public class Transaction {

	private String transactionType;
	//private Date date;
	private int amount;
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public Transaction(String transactionType, int amount) {
		this.transactionType = transactionType;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionType=" + transactionType + ", amount=" + amount + "]";
	}
	
	
}
