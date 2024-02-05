package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringLength {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Germany","England","China","Australia","Denmark","Brazil","France");
		Optional<String> countryName=list.stream().reduce((c1,c2)->c1.length()>c2.length()?c1:c2);
	    countryName.ifPresent(System.out::println);
		//System.out.println(countryName);

	}

}
