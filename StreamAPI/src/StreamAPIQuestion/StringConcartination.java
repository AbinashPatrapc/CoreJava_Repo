package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcartination {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Banana","Manogo","Ball","Apple","Brinjal");
		String result=li.stream().collect(Collectors.joining("+"));
        System.out.println(result);
	}

}
