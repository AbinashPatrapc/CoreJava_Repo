package com.hk.MapInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class SortingHashMapByValues {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Abinash");
		hm.put(121, "Zeeshan");
		hm.put(111, "Yakub");
		hm.put(103, "Wasim");
		hm.put(108, "Priya");
		hm.put(118, "Surya");
		hm.put(107, "Virat");
		ArrayList<String> al = new ArrayList<>(hm.values());
		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}
