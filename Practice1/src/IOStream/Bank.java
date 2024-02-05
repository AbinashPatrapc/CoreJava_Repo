package IOStream;

import java.io.Serializable;

public class Bank implements Serializable{
	private int AccNo;
	private String AccHName;
	private String UserName;
	private String Password;
	private double Balance;
	
	@Override
	public String toString() {
		return "Bank [AccNo=" + AccNo + ", AccHName=" + AccHName + ", UserName=" + UserName + ", Password=" + Password
				+ ", Balance=" + Balance + "]";
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getAccHName() {
		return AccHName;
	}
	public void setAccHName(String accHName) {
		AccHName = accHName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	
	
	

}
