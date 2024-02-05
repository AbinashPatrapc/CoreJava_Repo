package ATM.System;

public class Customer {
   private String name;
   private String address;
   private long mobileNum;
   
public Customer(String name, String address, long mobileNum) {
	this.name = name;
	this.address = address;
	this.mobileNum = mobileNum;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Customer Name=" + name + "\nAddress=" + address + "\nMobileNum=" + mobileNum;
}
public String getAddress() {
	return address;
}
public long getMobileNum() {
	return mobileNum;
}


   
   
}
