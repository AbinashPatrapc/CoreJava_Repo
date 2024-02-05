package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfMap {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Doubling each number using map
		List<Integer> doubledNumbers = numbers.stream()
		                                     .map(n -> n * 2)
		                                     .collect(Collectors.toList());
		System.out.println(doubledNumbers);

	}

}
