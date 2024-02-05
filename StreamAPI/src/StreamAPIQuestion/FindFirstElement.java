package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(23,98,23,12,43,23,12,78);
		int num=li.stream().findFirst().get();
        System.out.println(num);
	}

}
