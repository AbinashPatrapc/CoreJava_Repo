package com.hk.ListInterface;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 11; i++) {
			v.add(i);
			System.out.println(v.get(i));
		}
		System.out.println("Vector Size: " + v.size());
		System.out.println("Vector Capacity: " + v.capacity());
		System.out.println("Removed Element: " + v.remove(2));
		// For Iterating over Vector Object
		// Enumeration e=v.elements();
		Iterator e = v.iterator();
		v.add(20);
		while (e.hasNext()) {
			int i = (int) e.next();
			System.out.println("Elements are: " + i);
		}
	}
}
