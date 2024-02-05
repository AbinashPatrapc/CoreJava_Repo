package StreamAPIQuestion;

import java.util.Arrays;
import java.util.List;

public class CalculatingAverage {

	public static void main(String[] args) {
		List<Double> li=Arrays.asList(1.4,3.9,2.3,4.8,7.9);
		double avg=li.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(avg);
	}

}
