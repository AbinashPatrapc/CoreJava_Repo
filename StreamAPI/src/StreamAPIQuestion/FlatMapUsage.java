package StreamAPIQuestion;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUsage {
	public static void main(String[] args) {
		List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2, 3,4), 
				Arrays.asList(3, 4, 5, 6),
				Arrays.asList(5, 6, 7, 8));

		// Flattening nested lists into a single list
		List<Integer> flattenedNumbers = nestedNumbers.stream().flatMap(Collection::stream).distinct()
				.collect(Collectors.toList());
		System.out.println(flattenedNumbers);

	}
}
