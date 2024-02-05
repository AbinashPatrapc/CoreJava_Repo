package com.hk.ListInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> al3 = Arrays.asList(23, 56, 78, 34, 12, 23, 67, 89, 32, 23, 12, 78);
		Set<Integer> s1 = new HashSet();
		al3.stream().filter(a -> !s1.add(a)).forEach(System.out::println);
		;
	}

}
