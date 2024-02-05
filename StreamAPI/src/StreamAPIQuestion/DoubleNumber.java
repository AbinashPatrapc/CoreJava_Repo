package StreamAPIQuestion;

import java.util.List;
import java.util.stream.Collectors;

public class DoubleNumber {
public static void main(String[] args) {
	
	List<Integer> li=List.of(1,2,3,4);
	List<Integer>list=li.stream().filter(i->i!=1).map(i->i*2).collect(Collectors.toList());
	//li.stream().map(i->i*2).forEach(System.out::println);
	System.out.println(list);
}
}
