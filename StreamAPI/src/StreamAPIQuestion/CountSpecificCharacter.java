package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;

//Count the number of string present in a list that starts with a specific 
//character
public class CountSpecificCharacter {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Banana","Manogo","Ball","Apple","Brinjal");
        long num= li.stream().filter(s->s.startsWith("B")).count();
        System.out.println(num);
	}

}
