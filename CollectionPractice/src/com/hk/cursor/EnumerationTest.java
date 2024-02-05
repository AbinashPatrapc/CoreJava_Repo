package com.hk.cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
         public static void main(String[] args) {
			Vector v=new Vector();
			ArrayList al=new ArrayList();
			for(int i=0;i<=10;i++){
			    v.addElement(i);
			    al.add(i);
			}
			System.out.println(v);
			System.out.println(al);
			Enumeration e=v.elements();
			Enumeration eal=Collections.enumeration(al);
			
			while(e.hasMoreElements()) {
				int i=(Integer)e.nextElement();
				System.out.println(i+" ");
			}
			while(eal.hasMoreElements()) {
				int i=(Integer)eal.nextElement();
				System.out.println(i+" ");
			}
		}
}
