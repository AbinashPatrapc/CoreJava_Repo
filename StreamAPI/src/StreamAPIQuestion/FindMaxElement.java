package StreamAPIQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(85,23,65,12,20);
		int max=li.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
		/*
		  Approach 2
		  int max =  myList.stream().max(Integer::compare).get();           
          System.out.println(max); 
         */

	}

}
