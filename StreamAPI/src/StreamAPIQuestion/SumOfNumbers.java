package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {
	
	public static void main(String[] args) {
	List<Integer> al = Arrays.asList(23, 12, 11, 10, 18);
      int sum=al.stream().mapToInt(Integer::intValue).sum();
    // al.stream().map(i->i=i+i).collect(Collectors.toList());
      System.out.println(sum);
 }
}
