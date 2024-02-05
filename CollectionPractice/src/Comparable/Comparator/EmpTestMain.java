package Comparable.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class EmpTestMain {

	public static void main(String[] args) {
		EmployeeSorting e1 = new EmployeeSorting(101, "Adam");
		EmployeeSorting e2 = new EmployeeSorting(106, "Zimmy");
		EmployeeSorting e3 = new EmployeeSorting(111, "Citadel");
		EmployeeSorting e4 = new EmployeeSorting(109, "Sita");
		EmployeeSorting e5 = new EmployeeSorting(118, "Harish");
		EmployeeSorting e6 = new EmployeeSorting(114, "Rajnish");
		EmployeeSorting e7 = new EmployeeSorting(103, "MaheshBabu");
		EmployeeSorting e8 = new EmployeeSorting(219, "Soumyaa");

		TreeSet<EmployeeSorting> ts1 = new TreeSet();
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		ts1.add(e6);
		ts1.add(e7);
		ts1.add(e8);
		System.out.println(ts1);

		TreeSet<EmployeeSorting> ts2 = new TreeSet(new MyComparator1());
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		ts2.add(e5);
		ts2.add(e6);
		ts2.add(e7);
		ts2.add(e8);
		System.out.println(ts2);

	}

}

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeSorting e1 = (EmployeeSorting) o1;
		EmployeeSorting e2 = (EmployeeSorting) o2;

		String s1 = e1.getName();
		String s2 = e2.getName();
		return s1.compareToIgnoreCase(s2);
	}

}
