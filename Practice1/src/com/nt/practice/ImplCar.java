package com.nt.practice;

import java.util.Date;
import java.util.Scanner;

public class ImplCar {
	String model;
	int value;
	int pyear;
	int diff;
	int perc;
	int resaleValue;
	Scanner sc=new Scanner(System.in);
	void entry() {
		CarDetails cd=new CarDetails();
		System.out.print("Entry Car Model:");
		cd.setCarModel(sc.nextLine());
		System.out.print("Entry Purchase Value:");
		cd.setPurchaseValue(sc.nextInt());
		System.out.print("Enter Purchase Year:");
		cd.setPurchaseYear(sc.nextInt());
		
		model=cd.getCarModel();
		value=cd.getPurchaseValue();
		pyear=cd.getPurchaseYear();
		System.out.println("=============================");
		System.out.println("Car Model:"+model);
		System.out.println("Car Purchase Value:"+value);
		System.out.println("Car Purchase Year:"+pyear);
		
		
		Date dt=new Date();
		int Year=dt.getYear();
	    int currentYear=Year+1900;	
		System.out.println("Current Year:"+currentYear);
		
		diff= currentYear-pyear;
		System.out.println("Year Difference:"+diff);
		if(diff!=0) {
			 perc=diff*10;
			 System.out.println("Percentage:"+perc);
		}
		int PercValue = (value/100)*perc;
		resaleValue=value-PercValue;
		System.out.println("Car Resale Value:"+resaleValue);
	}

	public static void main(String[] args) {
       new ImplCar().entry();
	}

}
