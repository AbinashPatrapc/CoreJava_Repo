package StreamAPIQuestion;
//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
import java.util.Arrays;
import java.util.List;

public class NumberStartsWith1 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(12,13,23,41,19,29);
		li.stream().map(s->s+"").filter(i->i.startsWith("2")).forEach(System.out::println);

	}

}
