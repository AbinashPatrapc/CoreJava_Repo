package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankUser {
   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("BankDetails.ser"));
	System.out.println(ois.readObject());
	
	Bank accDetails=(Bank)ois.readObject();
	System.out.println(accDetails.getAccHName()+"Details");
	System.out.println(accDetails);
     }
}
