package com.hk.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(23);
		al.add(67);

		ListIterator<Integer> itr = al.listIterator();
		itr.add(45);
		while (itr.hasNext()) {
			System.out.println(itr.hasPrevious());
			System.out.println(itr.next());
		}
		System.out.println(al);

	}

}
