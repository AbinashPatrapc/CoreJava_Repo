package com.nt.mobile;

import java.util.Random;

public class Jio implements SimCard {
    String simname;
    
	public Jio(String simname) {
		super();
		this.simname = simname;
	}

	@Override
	public long phoneNumber() {
		 Random random = new Random();
	     long randomNumber = 1000000000L + random.nextLong() % 9000000000L;
	     System.out.println("Your Phone Number is : " + randomNumber);
		return 0;
	}

	@Override
	public String networkProvider(SimCard sim) {
		// TODO Auto-generated method stub
		return "Jio";
	}

	@Override
	public String simActivation(SimCard sim) {
		System.out.println("Your"+simname+"is Activated");
		return null;
	}

	@Override
	public String simDeactivation(SimCard sim) {
		System.out.println("Your"+simname+"is Deactivated");
		return null;
	}
}
