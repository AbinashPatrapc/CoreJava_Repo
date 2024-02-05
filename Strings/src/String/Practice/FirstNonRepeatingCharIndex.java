package String.Practice;

import java.util.Arrays;

public class FirstNonRepeatingCharIndex {
	public static void main(String[] args) {
//		String str = "abcdcabcfd";
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			count = 0;
//			for (int j = i + 1; j < str.length(); j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					count++;
//
//				}
//			}
//
//			if (count == 0) {
//				System.out.println(i);
//				break;
//			}
//
//		}
//
//	}
		String str = "abcdcabcfd";
        int[] charCount = new int[256];

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)]  ==1) {
                System.out.println(i);
                //break;
            }
        }
    }
}
