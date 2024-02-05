package StreamAPIQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSorting {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(23,98,23,12,43,23,12,78);
        li.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
