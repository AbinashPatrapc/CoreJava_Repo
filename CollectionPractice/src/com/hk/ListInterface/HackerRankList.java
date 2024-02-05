package com.hk.ListInterface;

public class HackerRankList {
	public static void staircase(int n) {
		// Write your code here
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		staircase(4);
	}
}
