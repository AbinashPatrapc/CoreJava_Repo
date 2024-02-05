package com.nt.mobile;

public class MobilePhoneClass implements MobilePhone {
        // private SimCard sim;
	@Override
	public void insertSim(SimCard sim) {
		//this.sim=sim;
		System.out.println("Your "+sim.networkProvider(sim)+" is Activated");
	}

	@Override
	public void removeSim(SimCard sim) {
		System.out.println("your "+sim.networkProvider(sim)+ " is deactivated");
	}

	@Override
	public void makingCall(SimCard sim,long number) {
		System.out.println("Connecting a Call to "+number+" with "+sim.networkProvider(sim)+" Network");
	}

	@Override
	public void sendTxtMsg(SimCard sim,String msg) {
		System.out.println("Sending "+msg+" with "+sim.networkProvider(sim)+"network");
	}
}
