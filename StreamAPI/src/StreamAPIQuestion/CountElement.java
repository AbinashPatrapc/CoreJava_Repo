package StreamAPIQuestion;
// Given a list of integers, find the total number of elements present in the list using Stream functions?
import java.util.Arrays;
import java.util.List;

public class CountElement {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(23,98,23,12,43,23,12,78);
		long count=li.stream().count();
		System.out.println(count);

	}

}
