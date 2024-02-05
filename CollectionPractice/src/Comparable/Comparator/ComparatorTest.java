package Comparable.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("Hello");
		ts.add("Hy");
		ts.add("Hey");
		ts.add(new StringBuffer("Welcome"));
		ts.add(new StringBuffer("Happy"));
		ts.add("Byeeeee");

		System.out.println(ts);
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();

		Integer i1 = s1.length();
		Integer i2 = s2.length();

		if (i1 > i2)
			return 1;
		else if (i1 < i2)
			return -1;
		else
			return s1.compareTo(s2);
	}

}
