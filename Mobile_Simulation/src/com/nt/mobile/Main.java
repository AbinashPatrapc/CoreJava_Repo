package com.nt.mobile;

public class Main{

	public static void main(String[] args) {
		MobilePhone mob=new MobilePhoneClass(); 
		Jio jio=new Jio("Jio");
		mob.insertSim(jio);
		mob.makingCall(jio, 787324429);
		mob.sendTxtMsg(jio, "Good Morning");
		mob.removeSim(jio);
		
		

	}

}
