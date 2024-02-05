
import java.util.Arrays;

public class Practice11 {
	private static void orderEvenOdd(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				output[j] = input[i];
				j++;
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 != 0) {
				output[j] = input[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		orderEvenOdd(ia);
	}
}
