package com.nt.lab;

public class NullHandle {
	public void display(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		NullHandle h = null;

		if (h == null) {
			h = new NullHandle();
			h.display(7);
		} else {
			h.display(5);
		}
	}

}
