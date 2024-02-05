package StreamAPIQuestion;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintNumbers {

	public static void main(String[] args) {
		IntStream.range(1, 101).forEach(System.out::println);
		Stream.of(12.2,23.0,45.12,2.98).forEach(System.out::println);
	}

}
