package com.nt.mobile;

public interface SimCard {
public long phoneNumber();
 public String networkProvider(SimCard sim);
 public String simActivation(SimCard sim);
 public String simDeactivation(SimCard sim);
}
