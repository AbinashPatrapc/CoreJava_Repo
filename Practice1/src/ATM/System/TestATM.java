package ATM.System;

import java.util.Scanner;

public class TestATM {

	public static void main(String[] args) throws InterruptedException {
		Customer cust1=new Customer("Helena","Balasore",9938025710l);
		Account acc1=new Account(11005300231l,1000,"Saving",cust1);
		Card card=new Card(674537283629l,"12/27","7873");
		Transaction[] tt=new Transaction[10];
		int index=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("==========:WELCOME TO OUPP ATM SERVICE:=======");
		System.out.print("Enter Your Pin:");
		String epin=sc.nextLine();
		if(card.validatePin(epin)) {
			while(true) {
			System.out.println("Welcome "+cust1.getName());
			System.out.println("====================================");
			System.out.println("Enter 1 for Diposit");
			System.out.println("Enter 2 for WithDraw");
			System.out.println("Enter 3 for Checking Balance");
			System.out.println("Enter 4 for Customer Details");
			System.out.println("Enter 5 for Transaction Statement");
			System.out.println("Enter 6 for Exit");
			System.out.println("..............................");
			System.out.print("Enter Your Option:: ");
			int opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.print("Enter Amount to Deposit: ");
				double dep=sc.nextDouble();
				try {
				System.out.println(acc1.deposit(dep));
				tt[index]=new Transaction("Deposit",dep);index++;
				}catch(InvalidAmountException e) {System.out.println(e.getMessage());}
				System.out.println(  );
				Thread.sleep(1000);
				break;
				
			case 2:
				System.out.print("Enter Amount to Withdraw: ");
				double with=sc.nextDouble();
				try {
				System.out.println(acc1.withdraw(with));
				tt[index]=new Transaction("Withdraw",with);index++;
				}catch(InsufficientAmountException e){System.out.println(e.getMessage());}
				System.out.println(  );
				Thread.sleep(1000);
				break;
				
			case 3:
				System.out.println("Your Current Balance is "+acc1.getBalance());
				System.out.println(  );
				Thread.sleep(1000);
				break;
				
			case 4:
				System.out.println(acc1.getCustomer());
				System.out.println(  );
				Thread.sleep(1000);
				break;
			case 5:
				System.out.println("Your Transaction Statement");
				for(int i=0;i<index;i++) {
					System.out.println(tt[i]);
				}
				System.out.println(  );
				Thread.sleep(1000);
				break;
				
			case 6:
				System.out.println("Thank You Visit Again");
				System.exit(0);
				
			default:
				System.out.println("Enter Valid Option");
				System.out.println(  );
				Thread.sleep(1000);
			}
			}
			
		}else {
			System.out.println("Access Denied Wrong Pin");
		}

	}

}
