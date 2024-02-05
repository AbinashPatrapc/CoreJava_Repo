package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Banana","Manogo","Ball","Apple","Brinjal");
        //li.stream().map(String::toUpperCase).forEach(System.out::println);
        li.stream().map(s->s.toUpperCase()).forEach(System.out::println);
       

	}

}
