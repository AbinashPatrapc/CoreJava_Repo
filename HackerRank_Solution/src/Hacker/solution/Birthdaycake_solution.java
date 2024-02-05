package Hacker.solution;

import java.util.ArrayList;
import java.util.List;

public class Birthdaycake_solution {
	 public static int birthdayCakeCandles(List<Integer> candles) {
	      int count=0;
	      int max=candles.get(0);
	      for(int i=0;i<candles.size();i++){
	          if(max<candles.get(i)){
	              max=candles.get(i);
	          }
	      }
	      for(int i=0;i<candles.size();i++){
	          if(max==candles.get(i)){
	              count++;
	          }
	      }
	      return count;

	    }
	public static void main(String[] args) {
		List<Integer> ll=new ArrayList();
		ll.add(3);
		ll.add(5);
		ll.add(1);
		ll.add(3);
		System.out.println(birthdayCakeCandles(ll));

	}

}
