package com.hk.SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new ComparatorDemo());
		set.add(new StringBuffer("Aba"));
		set.add(new StringBuffer("Jba"));
		set.add(new StringBuffer("Baba"));
		set.add(new StringBuffer("Kaba"));
		set.add(new StringBuffer("Mawa"));
		set.add(new StringBuffer("Zawa"));
		System.out.println(set);
	}
}

class ComparatorDemo implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		// or
		// String str3=(String)obj1;
		// String str4=(String)obj2;

		// return str1.compareTo(str2);//For Ascending Order
		// return -str1.compareTo(str2);//For Descending Order
		return str2.compareTo(str1);// Also for Descending order
	}
}