package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankTransaction {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Bank acc1= new Bank();
		acc1.setAccNo(1);
		acc1.setAccHName("Abinash");
		acc1.setUserName("Abinash_bittu");
		acc1.setPassword("Bittu@123");
		acc1.setBalance(100000);
		System.out.println(acc1);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("BankDetails.ser"));
		oos.writeObject(acc1);
		System.out.println("Object Saved Successfully");
	}

}
 