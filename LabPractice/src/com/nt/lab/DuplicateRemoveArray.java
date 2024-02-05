package com.nt.lab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoveArray {

	public static void main(String[] args) {
		int temp=0;
		int[] arr=new int[] {1,3,2,4,1,3,6,7,3,9,2,1};
		Arrays.sort(arr);
		Set s1=new HashSet();
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
			if(arr[i]!=arr[i+1]) {
				
			    temp=arr[i];
				
			}
			
		}
		System.out.println(temp);

	}

}
