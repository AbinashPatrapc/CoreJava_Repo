package StreamAPIQuestion;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilterMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(31);
		al.add(41);
		al.add(28);
		al.add(82);
		
		//al.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		al.stream().filter(i->i%2==0).forEach(System.out::println);

	}

}
