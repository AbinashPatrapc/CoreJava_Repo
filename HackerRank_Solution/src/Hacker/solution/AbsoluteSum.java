package Hacker.solution;

import java.util.ArrayList;
import java.util.List;

public class AbsoluteSum {
	public static List<Integer> playingWithNumbers(List<Integer> arr, List<Integer> queries) {
	    int sum=0;
	    List<Integer> ll=new ArrayList();
	    for(int j=0;j<queries.size();j++){
	        sum=0;
	    for(int i=0;i<arr.size();i++){
	        int temp=arr.get(i)+queries.get(j);
	        arr.set(i, temp);
	        sum =sum+Math.abs(arr.get(i));
	      }
	       ll.add(sum);
	    }
	    return ll;
	    }
	public static void main(String[] args) {
		List<Integer> ll=new ArrayList();
		ll.add(-1);ll.add(2);ll.add(-3);
		List<Integer> ll1=new ArrayList();
		ll1.add(1);ll1.add(-2);ll1.add(3);
		System.out.println(playingWithNumbers(ll, ll1));

	}

}
