package LogicalInterviewPOV;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 550;
		String originalStr = String.valueOf(n); // Convert the number to a string
		StringBuilder reversedStr = new StringBuilder();

		// Reverse the string by iterating from the end to the start
		for (int i = originalStr.length() - 1; i >= 0; i--) {
			reversedStr.append(originalStr.charAt(i));
		}

		// Output the reversed string
		System.out.println(reversedStr.toString());
	}
}


















