package ATM.System;

public interface ATM {
   public String deposit(double amount) throws Exception;
   public String withdraw(double amount)throws Exception;
   public double checkBalance()throws Exception;
}
