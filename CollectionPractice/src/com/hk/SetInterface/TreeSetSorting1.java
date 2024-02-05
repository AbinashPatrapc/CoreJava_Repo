package com.hk.SetInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSorting1 {
      public static void main(String[] args) {
		TreeSet<Object> set=new TreeSet<>(new TreeComparator());
		set.add("A");
		set.add("ABCDE");
		set.add("ABC");
		set.add("MNO");
		set.add("PQRSTU");
		set.add(new StringBuffer("ABCD"));
		set.add(new StringBuffer("MNOPQ"));
		set.add(new StringBuffer("RST"));
	    System.out.println(set);
	}
}
 class TreeComparator implements Comparator{
	 public int compare(Object obj1,Object obj2) {
		 String s1=obj1.toString();
		 String s2=obj2.toString();
		 
		 int i1=s1.length();
		 int i2=s2.length();
		 
		 if(i1>i2)
			return 1;
		 else if(i1<i2)
			 return -1;
		 else
			 return s1.compareTo(s2);
		 
	 }
 }
