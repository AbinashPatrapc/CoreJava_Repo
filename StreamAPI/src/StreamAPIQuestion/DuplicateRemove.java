package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;

public class DuplicateRemove {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(85,23,65,12,20,23,85,20);
		li.stream().distinct().forEach(System.out::println);
	}

}
