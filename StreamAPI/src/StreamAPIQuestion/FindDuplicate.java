package StreamAPIQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(23,98,23,12,43,23,12,78);
		Set<Integer> set=new HashSet();
		Set<Integer> li2=li.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		System.out.println(li2);
	}

}
