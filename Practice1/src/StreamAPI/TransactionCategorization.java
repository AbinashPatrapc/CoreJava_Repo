package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionCategorization {

	
	public static void main(String[] args) {
		Transaction t1=new Transaction("Withdraw",1000);
		Transaction t2=new Transaction("Deposit",5670);
		Transaction t3=new Transaction("Withdraw",2300);
		Transaction t4=new Transaction("Deposit",103100);
		Transaction t5=new Transaction("Withdraw",7000);
		Transaction t6=new Transaction("Withdraw",100032);
		Transaction t7=new Transaction("Deposit",1000);
		Transaction t8=new Transaction("Withdraw",106600);
		Transaction t9=new Transaction("Deposit",5000);
		Transaction t10=new Transaction("Withdraw",8000);
		
		List<Transaction> list=Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10);
		
		list.stream().filter(transaction -> transaction.getTransactionType().equalsIgnoreCase("Withdraw"));
		
		
		
		
	}
}
