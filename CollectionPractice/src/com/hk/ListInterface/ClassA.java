package com.hk.ListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ClassA {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(34);
		al.add(56);
		al.add(23);
		al.add(12);
		al.add(52);
		Collections.sort(al);// 12,23,34,52,56
		System.out.println(Collections.binarySearch(al, 34));// 2
		System.out.println(Collections.binarySearch(al, 23));// -2

		Collections.sort(al, (a, b) -> -(a - b));
		System.out.println(Collections.binarySearch(al, 60, (a, b) -> -(a - b)));

	}

}