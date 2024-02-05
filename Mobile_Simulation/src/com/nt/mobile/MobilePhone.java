package com.nt.mobile;

public interface MobilePhone {
public void insertSim(SimCard sim);
public void removeSim(SimCard sim);
public void makingCall(SimCard sim,long number);
public void sendTxtMsg(SimCard sim,String Message);
}
