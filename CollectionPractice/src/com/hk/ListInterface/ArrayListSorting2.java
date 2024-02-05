package com.hk.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(25);
		al.add(32);
		al.add(45);
		al.add(67);
		al.add(88);
		al.add(12);
		al.add(2);
		System.out.println("Before Sorting: " + al);
		Collections.sort(al, new MyComparator12());
		System.out.println("After Sorting: " + al);

	}

}

class MyComparator12 implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		return i1 - i2;
	}
}
