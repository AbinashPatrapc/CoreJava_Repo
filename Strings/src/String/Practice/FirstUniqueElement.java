package String.Practice;
//Has some bug
public class FirstUniqueElement {

	public static void main(String[] args) {
		String str = "abcdcabcfd";
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int c = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					c++;
					break;
				}
			}
			if (c == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
